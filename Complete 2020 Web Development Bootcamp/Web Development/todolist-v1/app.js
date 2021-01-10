const express = require("express");
const bodyParser = require("body-parser");

const app = express();

app.use("view engine", "ejs");


//assumes theres a views directory that contains an ejs page
app.get("/", function(req, res){

  var today = new Date();
  var currentDay = today.getDate();
  var day = "";

  if(currentDay === 6 || currentDay === 0){
    day = "Weekend";
  } else {
    day = "Weekday";
  }

  //render assumes theres a view directory with an ejs file called list
  //the key has to be the variable in the ejs file
  //the value is whats being pass to it, which is day in this case
  //usually use same variable, ex day: day but for this example to clarify
  res.render("list", {kindOfDay: day});

});

app.listen(3000, function(){
  console.log("Server started on port 3000");
});
