package main

import (
  "fmt"
  //"strings"
)

func main() {
  var f1 Fighter = Fighter{Name: "Bob", Health: 35, DamagePerAttack: 12}
  var f2 Fighter = Fighter{Name: "Joe", Health: 45, DamagePerAttack: 7}
  fmt.Println("The winner is...", DeclareWinner(f1, f2, f2.Name))
}
