# -*- coding: utf-8 -*-
second = int(input())
day = 0
hour = 0
minute = 0
seconds = 0
day = second // 86400
second = second % 86400
hour = second // 3600
second = second % 3600
minute = second // 60
second = second % 60
seconds = second
print (day, hour, minute, seconds)