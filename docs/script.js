function calculate() {
    const leftOperand = parseInt(document.getElementById("leftInput").value);
    const rightOperand = parseInt(document.getElementById("rightInput").value);
    const operator = document.getElementById("operator").value;

    if (!Number.isInteger(leftOperand) || !Number.isInteger(rightOperand)) {
        alert("Error 🫠");
        return;
    }

    let result;
    switch (operator) {
        case "+":
            result = leftOperand + rightOperand;
            break;
        case "-":
            result = leftOperand - rightOperand;
            break;
        case "*":
            result = leftOperand * rightOperand;
            break;
        case "/":
            if (rightOperand === 0) {
                alert("Learn maths bro!");
                return;
            }
            result = leftOperand / rightOperand;
            break;
        case "%":
            if (rightOperand === 0) {
                alert("Learn maths bro!");
                return;
            }
            result = leftOperand % rightOperand;
            break;
        default:
            alert("Invalid operator");
            return;
    }

    alert("Result: " + result);

    console.log("Result:", result);
}
