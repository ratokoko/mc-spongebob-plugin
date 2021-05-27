import requests
import os
import time
from PIL import Image

# INSERT VARIABLES HERE
EPISODE_STRING = "ten"
SEASON_NUM = "01"
EPISODE_NUM = "10"
BEGINNING_FRAME = 1
EPISODE_FRAMES = 1320
#

# spongebob frames

for spongebob_frame in range(BEGINNING_FRAME, EPISODE_FRAMES+1):
    os.system('cls')
    print(f"On frame: {spongebob_frame}")

    if spongebob_frame < 10:
        spongebob_frame = f"000{spongebob_frame}"
    elif spongebob_frame < 100:
        spongebob_frame = f"00{spongebob_frame}"
    elif spongebob_frame < 1000:
        spongebob_frame = f"0{spongebob_frame}"
    else:
        spongebob_frame = f"{spongebob_frame}"

    if not os.path.exists(f"./ep_{EPISODE_STRING}/images/{spongebob_frame}.png"):
        url = f"https://esfio-frame-host.duckdns.org/S{SEASON_NUM}E{EPISODE_NUM}/{spongebob_frame}.png"
        while True:
            try:
                response = requests.get(url)
                f = open(f"./ep_{EPISODE_STRING}/images/{spongebob_frame}.png", "wb")
                f.write(response.content)
                f.close()

                beforeimg = Image.open(f"./ep_{EPISODE_STRING}/images/{spongebob_frame}.png")
                beforeimg = beforeimg.resize((60, 45), Image.ANTIALIAS)
                beforeimg.save(f"./ep_{EPISODE_STRING}/images/{spongebob_frame}.png")
                beforeimg.close()
                break
            except requests.exceptions.ConnectionError:
                for i in reversed(range(1, 11)):
                    os.system('cls')
                    print(f"On frame: {spongebob_frame}")
                    print("Connection refused.")
                    print(f"Wating {i} seconds until next request.")
                    time.sleep(1)
