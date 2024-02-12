// return string containing the unsigned binary form of input "n"
function intToBinary(n) {
  let binAnswer = ""
  let i = 0
  while(2**i < n) {
    i++
  }
  let binDigits = i
  console.log("binary digits = " + binDigits)
  let intRemaining = n
  for(i = binDigits; i >= 0; i--) {
    if(intRemaining >= 2**i) {
      intRemaining -= 2**i
      binAnswer += "1"
    } else {
      if(i !== binDigits || i === 0) {
        binAnswer += "0"
      }
    }
  }
  return binAnswer
}