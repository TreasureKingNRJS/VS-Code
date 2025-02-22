import datetime
print(datetime.datetime.now())
print(datetime.date.today())

#Formatting

now = datetime.datetime.now()
won = datetime.datetime.now()
#Cap Y = 2024 , small y = 24
print(now.strftime("%d:%m:%Y"))

#We can use variables
print(datetime.datetime(year=2008,month=12,day=15,hour=9,minute=0,second=0))
print(now-datetime.datetime(2008,12,15,9,0,0))
print(now-won)
