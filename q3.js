function outerFunction() {
    let outerVariable = "KDU";

    function innerFunction(enchantingObject) {
        for (let property in enchantingObject) {
            if (typeof enchantingObject[property] === "string") {
                outerVariable += " " + enchantingObject[property];
            }
        }

        return outerVariable;
    }

    return innerFunction;
}

const obj1 = {
    a: 15,
    b: 20,
    c: "24",
};

const obj2 = {
    a: 5,
    b: 10,
    c: "WORLD",
    d: true
};

const closureFunction = outerFunction();

const magicalOutput1 = closureFunction(obj1);
const magicalOutput2 = closureFunction(obj2);

console.log(magicalOutput1);
console.log(magicalOutput2);
