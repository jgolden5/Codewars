package main

import (
  "fmt"
  "strings"
)

func main() {
  test := "hello world"
  fmt.Println(ReverseWords(test))
}

func ReverseWords(str string) string {
  reversed := ""
  words := strings.Split(str, " ") //becomes a slice of strings separated by space delimiter
  for i := len(words) - 1; i >= 0; i-- {
    reversed += words[i] + " "
  }
  reversed = reversed[:len(reversed)-1] //removes last char from reversed string
  return reversed
}
