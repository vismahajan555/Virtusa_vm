
const form = document.querySelector("#form");
const btn__text = document.querySelector(".btn__text");
const loader = document.querySelector(".loader");

// Clear all form fields.
const clearForm = () => form.reset();

const showLoader = (sec) => {
  btn__text.classList.toggle("hide");
  loader.classList.toggle("show");

  setTimeout(() => {
    btn__text.classList.toggle("hide");
    loader.classList.toggle("show");
    clearForm();
  }, sec * 1000);
};

// Show the loader for 4 seconds. 
const handleSubmit = (e) => {
  e.preventDefault();
  showLoader(4);
};

form.addEventListener("submit", handleSubmit);
