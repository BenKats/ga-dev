// part 1 - make a function called 'makeCall' that will make an AJAX GET request to 'https://randomuser.me/api/' and console.log the response in the success function - 10 min

const makeCall = function() {
    fetch('https://randomuser.me/api/')
        .then(response => {
            return response.json();
        })
        .then(data => {
            console.log(data);
            getData(data.results[0]);
        })
        .catch(error => console.error(error));
};
makeCall();
// part 2 - write a function called getData that will parse the results from the ajax request and set new variables for the user's first name, last name, email, dob, street, city, state, address, phone, password, and image.
// Call this function from the success method of your AJAX call. - 15 min

const getData = function(data) {
    const firstName = data.name.first;
    const lastName = data.name.last;
    const email = data.email;
    const dob = data.dob;
    const street = data.location;
    const city = data.location.city;
    const state = data.location.state;
    const address = data.location.address;
    const phone = data.phone;
    const password = data.login.password;
    const image = data.picture.large;
    manipulateDom(`${firstName} ${lastName}`, email, dob, address, phone, password, image);
    // console.log(firstName);
    // console.log(lastName);
    // console.log(email);
    // console.log(dob);
    // console.log(street);
    // console.log(city);
    // console.log(state);
    // console.log(address);
    // console.log(phone);
    // console.log(password);
    // console.log(image);
};

// part 3 - write a function called manipulateDom that will accept the name, email, dob, address, phone, pw, and image as arguments.

// Assign these values as data attributes to the html elements as follows.
// the element with the id of 'bigtext' should have the the user's name for its text
// the element with the id of 'photo' shouls have the user's image for it's background-image
// the element witht he id of 'name' should have the user's name for its data attribute
// the element with the id of 'email' should have the user's email for its data attribute
// the element with the id of 'birthdate' should have the user's birthdate for its data attribute
// the element with the id of 'address' should have the user's address for its data attribute
// the element with the id of 'phone' should have the user's phone for its data attribute
// the element with the id of 'password' should have the user's password for its data attribute
// call this function from inside `getData` and pass in the appropriate values - 20 min

const manipulateDom = function(name, email, dob, address, phone, pw, img_url) {
    document.getElementById('bigtext').innerText = name;
    // document.getElementById('photo') =
    // document.getElementById('name') =
    // document.getElementById('email') =
    // document.getElementById('birthdate') =
    // document.getElementById('address') =
    // document.getElementById('phone') =
    // document.getElementById('password') =
};

// part 4 - write a click handler for the button that will call the makeCall function - 5 min

// part 5 - write a function called addEventListeners that will add hover listeners for the icons on the page - 10 min
//
// when hovering over #name, the #smalltext should say 'My name is', and the #bigtext should use the #name's data attribute for its text
// when hovering over #email, the #smalltext should say 'My email is', and the #bigtext should use the #email's data attribute for its text
// when hovering over #birthdate, the #smalltext should say 'My birthday is', and the #bigtext should use the #birthdate's data attribute for its text
// when hovering over #address, the #smalltext should say 'My addresss is', and the #bigtext should use the #address's data attribute for its text
// when hovering over #phone, the #smalltext should say 'My phone number is', and the #bigtext should use the #phone's data attribute for its text
// when hovering over #password, the #smalltext should say 'My password is', and the #bigtext should use the #password's data attribute for its text

function addEventListeners() {}
