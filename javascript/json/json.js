const person = {
                name : "Irfan",
                age : 43,
                weight : 67,
                hobbies : ["riding","vlogging","travelling"]
                }
const JSONObject = JSON.stringify(person)
console.log("JSON Object ", JSONObject);
const JSObject = JSON.parse(JSONObject)
console.log("JS Object ",JSObject);
