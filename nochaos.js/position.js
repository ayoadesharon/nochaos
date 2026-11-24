const input = require("prompt-sync")();

let word = input("Enter a string: ");

for (let position = 0; position < word.length; position += 2) {
    console.log(word.charAt(position));
}
