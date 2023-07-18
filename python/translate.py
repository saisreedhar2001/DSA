import tkinter as tk
import boto3

root = tk.Tk()

root.geometry("400x240")
root.title("translate")

textExample = tk.Text(root,height=10)
textExample.pack()

def gettext():
   # aws_mag_con = boto3.session.Session(profile_name='NagaSaiSreedhar')
    client = boto3.client(service_name='translate',region_name='us-east-1')
    result = textExample.get("1.0","end")
    print(result)
    response = client.translate_text(Text = result,SourceLanguageCode='en',TargetLanguageCode = 'hi')

    print("TranslatedText: "+ response.get('SourceLanguageCode'))

    print("sourcelanguagecode: "+ response.get('SourceLanguageCode'))

    print("targetlanguagecode: "+ response.get('SourceLanguageCode'))

    btnRead = tk.Button(root,height = 1,width =10,text = "read",command =gettext )
    btnRead.pack()

