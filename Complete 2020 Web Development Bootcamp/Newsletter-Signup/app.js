const express = require("express");
const bodyParser = require("body-parser");
const request = require("request");
const https = require("https");

//new instance of express, to listen to port
const app = express();

//need to use express.static to serve up static files
//href will be relative to /public
app.use(express.static("public"));
app.use(bodyParser.urlencoded({extended: true}));

//can only have 1 send in a get, have to use res.write and res.send to send mutiple data back
//use res.sendFile to sent a whole html page
app.get("/", function(req, res){
  res.sendFile(__dirname + "/signup.html");
});

app.post("/", function(req, res){
  var firstName = req.body.firstName;
  var lastName = req.body.lastName;
  var email = req.body.email;

//members is an array of objects, so another curly brace
  var data = {
    members: [
      {
        email_address: email,
        status: "subscribed",
        merge_fields: {
          FNAME: firstName,
          LNAME: lastName
        }
      }
    ]
  }

//all these var can be const since they wont change
//turn data js object into json
  var jsonData = JSON.stringify(data);
//usX - replace it with your region
  const url = "https://us7.api.mailchimp.com/3.0/lists/f3e8fcf3f1";
//mailchimp api said the username could be anything following :API-Key
  const options = {
    method: "POST",
    auth: "username:eeb9eff00577d906e1001bbf2c3856a7-us7"
  }

  const request = https.request(url, options, function(response){
    if(response.statusCode === 200){
      res.sendFile(__dirname + "/success.html");
    } else{
      res.sendFile(__dirname + "/failure.html");
    }
    response.on("data", function(data){
      console.log(JSON.parse(data));
    })
  })

  request.write(jsonData);
  request.end();
});

app.post("/failure", function(req, res){
  res.redirect("/");
})

app.listen(3000, function(){
  console.log("Server is running on port 3000");
});

//API Key
//eeb9eff00577d906e1001bbf2c3856a7-us7


//List ID
//f3e8fcf3f1
