const mongoose = require('mongoose');

//27017 default mongodb port, followed by the database name
//will connect to fruitsDB, if not it will create it

//{useNewUrlParser: true} to get rid of deprecation warning, it will most likely not be needed in the future updated version
mongoose.connect("mongodb://localhost:27017/fruitsDB", {useNewUrlParser: true});

//creating the schema for our collection
const fruitSchema = new mongoose.Schema ({
  name: {
    type : String,
    required: [true, "P;ease check your data entry, no name specified"] //make name required
  }
  rating: {
    type: Number,
    min: 1,
    max: 10
  },
  review: String
});

//first argument is the name of the collection, and by covention name it singular..
//.. as for mongoose will automatically convert it the plural form
//2nd argument is the schema it follows
const Fruit = mongoose.model("Fruit", fruitSchema);

const fruit = new Fruit ({
  name: "Durian",
  rating: 3,
  review: "ew"
});

//will save this to the collection

// fruit.save();


const personSchema = new mongoose.Schema ({
  name: String,
  age: Number,
});

const Person = mongoose.model("Person", personSchema);

const person = new Person({
  name: "John",
  age: 37
})

// person.save();

const orange = new Fruit ({
  name: "Orange",
  rating: 4,
  review: "oj"
});
const banana = new Fruit ({
  name: "Banana",
  rating: 8,
  review: "bananaboy"
});
const kiwi = new Fruit ({
  name: "Kiwi",
  rating: 6,
  review: "green and sour"
});

//1st argument, array of obj that match the schema
//2nd is a call back function for errors

// Fruit.insertMany([kiwi, orange, banana], function(err){
//   if (err){
//     console.log(err);
//   }else {
//     console.log("Successfully saved all fruits to FruitsDB");
//   }
// });


//FIND: 1st param is err;
//2nd param is the array of result we will get back if sucessful
Fruit.find(function(err, fruits){
  if (err){
    console.log(err);
  } else {

    mongoose.connection.close();

    fruits.forEach(function(fruit){
      console.log(fruit.name);
    });
  }
});

//UPDATE: 3 required param, the query filter, what fields to update, error

// Fruit.updateOne({_id: "603313f64595730f2c818c53"}, {name: "Peach"}, function(err) {
//   if (err){
//     console.log(err);
//   } else {
//     console.log("Successfully updated");
//   }
// });

//DELETE:
// Fruit.deleteOne({name: "Peach"}, function(err){
//   if(err){
//     console.log(err);
//   }else {
//     console.log("Successfully deleted");
//   }
// });


// Person.deleteMany({name: "John"}, function(err){
//   if(err){
//     console.log(err);
//   }else {
//     console.log("Successfully deleted all");
//   }
// });
