document.addEventListener('DOMContentLoaded', () => {
  const button = document.getElementById("button");
  button.addEventListener('click', handleButtonClick)

  const input = document.getElementById("input")
  input.addEventListener("input", handleInput)

  const select = document.getElementById('select')
  select.addEventListener("change", handleSelectChange)

  const form = document.getElementById('form')
  form.addEventListener("submit", handleFormSubmit)
});

// document.addEventListener()
const handleButtonClick = function (){
  const resultParagraph = document.getElementById("button-result")
  resultParagraph.textContent = "The Button has been clicked"
}

const handleInput = function(event){
  const inputResult = document.getElementById("input-result")
  // console.log(event.target.value)
  const inputText = event.target.value
  inputResult.textContent = `${inputText} has been typed`
}

const handleSelectChange = function(event){
  const selectedOption = event.target.value
  const selectResult = document.getElementById('select-result')
  
  selectResult.textContent = `${selectedOption} has been selected`
}

const handleFormSubmit = function(event){
  event.preventDefault()
  console.log(event)

  const firstName = event.target[0].value
  console.log(firstName)

  const secondName = form.last_name.value
  console.log(secondName)
}