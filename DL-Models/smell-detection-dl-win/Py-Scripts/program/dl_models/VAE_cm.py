import os
import autoencoder

TOKENIZER_OUT_PATH = r"C:\Users\author\Documents\thesis\pythonNotebook\tokenizerOut"
#TOKENIZER_OUT_PATH = "/home/author/TagCoder/tokenizer_out_java/"
OUT_FOLDER = r"C:\Users\author\Documents\thesis\pythonNotebook"
# TOKENIZER_OUT_PATH = r"..\..\data\tokenizer_out"
# OUT_FOLDER = r"..\results\rq1\raw"

smell_list = ["Multifaceted",'ComplexMethod','LongMethod']
DIM = "1d"

for smell in smell_list:
    data_path = os.path.join(TOKENIZER_OUT_PATH, smell, DIM)
    autoencoder.main_lstm(smell, OUT_FOLDER, data_path, skip_iter=-1)

