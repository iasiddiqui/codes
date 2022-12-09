#@ before run this programm run the below statemnet on your terminal 
#@ Statement ----->>>>  pip install pywhatkit


import random

import pyautogui as pg  
import time
message = ('Pranked','hiiii')   #@ write what you want to send
time.sleep(3)
for i in range(30):
    m=random.choice(message)
    pg.write('You are '+m)    #@ before animal what you want tp print
    pg.press('enter')
    
 #@ run this code and select your contact where you want to send message
