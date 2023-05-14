import json
from tkinter import *
from tkinter import scrolledtext
import git

def zadanie11():
    repo = txt.get()
    owner = "openshift"

    pf = f"https://github.com/LeonovaEA/zadanie"
    repository_pf = git.get(pf).json()

    try:
        repository_pf['company']
        repository_pf['email']
    except KeyError:
            repository_pf['company'] = None
            repository_pf['email'] = None

    with open("File.txt", "a+") as f:
        f.write(f"'company': '{repository_url['company']}'\n")
        f.write(f"'created_at': '{repository_url['created_at']}'\n")
        f.write(f"'email': '{repository_url['email']}'\n")
        f.write(f"'id': '{repository_url['id']}'\n")
        f.write(f"'name': '{repository_url['name']}'\n")
        f.write(f"'url': '{repository_url['url']}'\n")
        f.write("\n")
    with open("File.txt", "r+") as f2:
        line = f2.read()
root = Tk()
root.title("JSONPars")
root.geometry('600x400')
r = Label(root, text="имя репозитория")
r2 = Label(root, text="Например: json")
r.grid(padx=150, pady=15)
tek = Entry(root, width=50, justify="center")
tek.grid(padx=150, pady=15)
btn = Button(root, text="Нажать", command=pars)
tek2 = scrolledtext.ScrolledText(root, height=10, width=50, bg='#000000', fg='#008000')
tek2.grid(padx=100, pady=15)
root.mainloop()
