import json
def F():
    v = name.get()
    f_json= """
    {
        'company': None
        'created_at': '2014-07-11T17:01:00Z'
        'email': None
        'id': 8137302
        'name': 'Evgenia Leonova'
        'url': 'https://github.com/LeonovaEA'
    }"""

    if v == 'VScode':
        with open('C:/Users/Professional/Downloads/vivodR.json', 'w') as file:
            json.dump(f_json,file)
        
        
    else:
        print('Данное имя не задано')

    



import tkinter as tk 
window = tk.Tk()
window.geometry('400x300')
window.title("json") 
name = tk.Entry(window)
name.grid(padx=120, pady=15)
btn = tk.Button(window, text="click", command=F)
btn.grid(padx=90, pady=15)
window.mainloop()
F()
