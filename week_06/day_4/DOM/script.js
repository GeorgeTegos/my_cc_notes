console.log("Hello World")

const square = (num)=> num * num;

console.log(document)

const title = document.querySelector("h1") 
console.log(title)

title.textContent = "Fringeless Events"

const rabbieEventTitle = document.querySelector(".event > h3")

// Manipulating the text content of rabbieEventTitle
rabbieEventTitle.textContent = "shit-faced Rabbie Burns"
console.log(rabbieEventTitle)

// Getting all .event nodes
const events = document.querySelectorAll(".event")
console.log(events)

// Looping through all .event nodes
for(const event of events){
    console.log(event)
}
// Adding a class to rabbieEvent title
rabbieEventTitle.classList.add("active")

const button = document.getElementById("add-event")
console.log(button)

const newEvent = document.createElement("li");
console.log(newEvent)

const eventList = document.getElementById("event-list")
console.log(eventList)

eventList.appendChild(newEvent)


const newEventTitle = document.createElement("h3")
newEventTitle.textContent = "Ladyboys of Bangkok"
newEvent.appendChild(newEventTitle)
