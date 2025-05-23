import requests
import json
import tkinter as tk
from tkinter import messagebox
def get_repo_info(owner, repo_name):
    url = f'https://api.github.com/repos/Kubernetes/{repo_name}'
    response = requests.get(url)
    if response.status_code == 200:
        repo_data = response.json()
        repo_info = {
            'company': None,
            'created at': repo_data.get('created_at'),
            'email': None,
            'id': repo_data.get('id'),
            'name': repo_data.get('name'),
            'url': repo_data.get('html_url')  
        }
        return repo_info
    else:
        messagebox.showerror('Ошибка', 'Репозиторий не найден')
def button_click():
    repo_name = entry.get()
    owner = 'kubernetes'  
    if repo_name:
        repo_info = get_repo_info(owner, repo_name)
        if repo_info:
            with open(f'{repo_name}_info.json', 'w') as json_file:
                json.dump(repo_info, json_file, indent=4)
            messagebox.showinfo("Отлично", f"Информация  сохранена в файл '{repo_name}_info.json'")
root = tk.Tk()
root.title('Repo Info')
tk.Label(root, text='Введите имя репозитория (например, "kubernetes"):').pack(pady=5)
entry = tk.Entry(root, width=50)
entry.pack(pady=5)
button = tk.Button(root, text="Получить информацию", fg="red", command=button_click)
button.pack(pady=25)
root.mainloop()
