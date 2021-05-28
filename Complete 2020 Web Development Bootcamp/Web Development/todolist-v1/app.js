const express = require("express");
const bodyParser = require("body-parser");

const app = express();

//only difference between let and var is let has the scope its declared in
//while if you create a var in a loop, it can be accessed outside of the loop

//array in js is dynamic
let items = ["cook", "clean", "eat"];
let workItems = [];

app.set('view engine', 'ejs');

app.use(bodyParser.urlencoded({extended: true}));

//need to use this to serve up other folder than the defaault main(app.js) and views folder
//so we can use our styles.css
app.use(express.static("public"));

//assumes theres a views directory that contains an ejs page
app.get("/", function(req, res){

  let today = new Date();

  /*
  var currentDay = today.getDate();
  var day = "";

  if(currentDay === 6 || currentDay === 0){
    day = "Weekend";
  } else {
    day = "Weekday";
  }
  */

  let options = {
    weekday: "long",
    day: "numeric",
    month: "long"
  };

  let day = today.toLocaleDateString("en-US", options);``

  //render assumes theres a view directory with an ejs file called list
  //the key has to be the variable in the ejs file
  //the value is whats being pass to it, which is day in this case
  //usually use same variable, ex day: day but for this example to clarify
  res.render("list", {listTitle: day, newListItems: items});

});

app.post("/", function(req, res){
  let item = req.body.newItem;

  if (req.body.list === "Work"){
    workItems.push(item);
    res.redirect("/work");
  }

  items.push(item);
  res.redirect("/");
});


app.get("/work", function(req, res){
  res.render("list", {listTitle: "Work List", newListItems: workItems});
})

app.post("/work", function(req, res){
  let item = req.body.newItem;

  workItems.push(item);

  res.redirect("/work");
});

app.get("/about", function(req, res){
  res.render("about");
})

app.listen(3000, function(){
  console.log("Server started on port 3000");
});
