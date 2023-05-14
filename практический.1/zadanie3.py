# -*- coding: utf-8 -*-
age = int(input("Возраст "))
name = input("Имя ")
years = 0
if name == ("Иван"):
 print("Вам не сюда-_-")
elif age > 0 and age < 75:
 if age >= 16:
  print("Поздравляем вы поступили в ВГУИТ")
elif age < 16:
 years = 16 - age
print("Вам осталось учиться", years , ("лет"))