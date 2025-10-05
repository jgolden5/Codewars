package main

import (
  "fmt"
  //"strings"
)

func main() {
  y1 := 2000
  y2 := 2100
  y3 := 1999
  y4 := 2024
  y5 := 2300
  y6 := 2400
  fmt.Println(y1, IsLeapYear(y1))
  fmt.Println(y2, IsLeapYear(y2))
  fmt.Println(y3, IsLeapYear(y3))
  fmt.Println(y4, IsLeapYear(y4))
  fmt.Println(y5, IsLeapYear(y5))
  fmt.Println(y6, IsLeapYear(y6))
}
