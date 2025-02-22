from tkinter import *


win = Tk() # Window
win.geometry("600x500")
win.title("Hai Beauty")
win.configure(bg="grey")

a=1000
lab = Label(win,text=a,width=90,height=5,bg="black",fg="white")

def b():
    print("Button Clicked!")

bt1 = Button(win,text="Nithin",width=10,height=5,bg="green",fg="yellow",command=b)
bt2 = Button(win,text="Raj",width=10,height=5,bg="green",fg="yellow",command=b)




#lab.grid(row=10,column=10)
#bt1.grid(row=10,column=0)
#bt2.grid(row=0,column=10)
lab.pack() # Attach to window
bt1.pack() # Attach to window
bt2.pack() # Attach to window
#Search browser for tkinter widgets

win.mainloop()