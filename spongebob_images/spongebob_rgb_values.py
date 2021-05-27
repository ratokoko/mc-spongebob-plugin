from PIL import Image
from math import sqrt
import os
import time
import json

os.system('cls')

COLORS = {
   "blocks_rgb":[
      [
         224,
         220,
         200
      ],
      [
         107,
         88,
         57
      ],
      [
         146,
         99,
         86
      ],
      [
         158,
         164,
         176
      ],
      [
         18,
         18,
         18
      ],
      [
         115,
         115,
         115
      ],
      [
         119,
         85,
         59
      ],
      [
         122,
         122,
         122
      ],
      [
         103,
         121,
         103
      ],
      [
         8,
         10,
         15
      ],
      [
         44,
         46,
         143
      ],
      [
         96,
         59,
         31
      ],
      [
         21,
         119,
         136
      ],
      [
         54,
         57,
         61
      ],
      [
         73,
         91,
         36
      ],
      [
         35,
         137,
         198
      ],
      [
         94,
         168,
         24
      ],
      [
         169,
         48,
         159
      ],
      [
         224,
         97,
         0
      ],
      [
         213,
         101,
         142
      ],
      [
         100,
         31,
         156
      ],
      [
         142,
         32,
         32
      ],
      [
         207,
         213,
         214
      ],
      [
         240,
         175,
         21
      ],
      [
         97,
         219,
         213
      ],
      [
         129,
         140,
         143
      ],
      [
         134,
         96,
         67
      ],
      [
         81,
         217,
         117
      ],
      [
         109,
         128,
         116
      ],
      [
         225,
         230,
         170
      ],
      [
         221,
         223,
         165
      ],
      [
         67,
         30,
         32
      ],
      [
         47,
         64,
         139
      ],
      [
         119,
         106,
         85
      ],
      [
         52,
         118,
         125
      ],
      [
         83,
         90,
         93
      ],
      [
         117,
         142,
         67
      ],
      [
         94,
         164,
         208
      ],
      [
         162,
         197,
         55
      ],
      [
         208,
         100,
         191
      ],
      [
         154,
         147,
         91
      ],
      [
         235,
         154,
         181
      ],
      [
         109,
         48,
         152
      ],
      [
         181,
         59,
         53
      ],
      [
         188,
         212,
         202
      ],
      [
         234,
         192,
         88
      ],
      [
         143,
         118,
         69
      ],
      [
         249,
         236,
         78
      ],
      [
         143,
         139,
         124
      ],
      [
         125,
         173,
         255
      ],
      [
         165,
         194,
         245
      ],
      [
         219,
         219,
         219
      ],
      [
         135,
         130,
         126
      ],
      [
         38,
         67,
         137
      ],
      [
         102,
         112,
         134
      ],
      [
         105,
         99,
         89
      ],
      [
         52,
         40,
         23
      ],
      [
         206,
         206,
         201
      ],
      [
         87,
         67,
         26
      ],
      [
         102,
         81,
         49
      ],
      [
         45,
         28,
         12
      ],
      [
         141,
         145,
         36
      ],
      [
         113,
         88,
         73
      ],
      [
         111,
         54,
         52
      ],
      [
         100,
         67,
         50
      ],
      [
         20,
         18,
         29
      ],
      [
         169,
         91,
         51
      ],
      [
         61,
         39,
         18
      ],
      [
         195,
         179,
         123
      ],
      [
         154,
         110,
         77
      ],
      [
         156,
         127,
         78
      ],
      [
         103,
         77,
         46
      ],
      [
         236,
         233,
         226
      ],
      [
         125,
         84,
         79
      ],
      [
         171,
         27,
         9
      ],
      [
         70,
         43,
         26
      ],
      [
         132,
         107,
         107
      ],
      [
         215,
         208,
         154
      ],
      [
         216,
         209,
         157
      ],
      [
         219,
         211,
         161
      ],
      [
         84,
         64,
         51
      ],
      [
         125,
         125,
         125
      ],
      [
         122,
         122,
         122
      ],
      [
         114,
         119,
         106
      ],
      [
         130,
         131,
         131
      ],
      [
         133,
         133,
         134
      ],
      [
         179,
         179,
         182
      ],
      [
         183,
         183,
         185
      ],
      [
         153,
         113,
         98
      ],
      [
         159,
         114,
         98
      ],
      [
         20,
         21,
         25
      ],
      [
         53,
         57,
         157
      ],
      [
         114,
         71,
         40
      ],
      [
         21,
         137,
         145
      ],
      [
         62,
         68,
         71
      ],
      [
         84,
         109,
         27
      ],
      [
         58,
         175,
         217
      ],
      [
         112,
         185,
         25
      ],
      [
         189,
         68,
         179
      ],
      [
         240,
         118,
         19
      ],
      [
         237,
         141,
         172
      ],
      [
         121,
         42,
         172
      ],
      [
         160,
         39,
         34
      ],
      [
         233,
         236,
         236
      ],
      [
         248,
         197,
         39
      ]
   ],
   "224 220 200":[
      "bone_block"
   ],
   "107 88 57":[
      "bookshelf"
   ],
   "146 99 86":[
      "bricks"
   ],
   "158 164 176":[
      "clay"
   ],
   "18 18 18":[
      "coal_block"
   ],
   "115 115 115":[
      "coal_ore"
   ],
   "119 85 59":[
      "coarse_dirt"
   ],
   "122 122 122":[
      "cobblestone"
   ],
   "103 121 103":[
      "mossy_cobblestone"
   ],
   "8 10 15":[
      "black_concrete"
   ],
   "44 46 143":[
      "blue_concrete"
   ],
   "96 59 31":[
      "brown_concrete"
   ],
   "21 119 136":[
      "cyan_concrete"
   ],
   "54 57 61":[
      "gray_concrete"
   ],
   "73 91 36":[
      "green_concrete"
   ],
   "35 137 198":[
      "light_blue_concrete"
   ],
   "94 168 24":[
      "lime_concrete"
   ],
   "169 48 159":[
      "magenta_concrete"
   ],
   "224 97 0":[
      "orange_concrete"
   ],
   "213 101 142":[
      "pink_concrete"
   ],
   "100 31 156":[
      "purple_concrete"
   ],
   "142 32 32":[
      "red_concrete"
   ],
   "207 213 214":[
      "white_concrete"
   ],
   "240 175 21":[
      "yellow_concrete"
   ],
   "97 219 213":[
      "diamond_block"
   ],
   "129 140 143":[
      "diamond_ore"
   ],
   "134 96 67":[
      "dirt"
   ],
   "81 217 117":[
      "emerald_block"
   ],
   "109 128 116":[
      "emerald_ore"
   ],
   "225 230 170":[
      "end_stone_bricks"
   ],
   "221 223 165":[
      "end_stone"
   ],
   "67 30 32":[
      "black_glazed_terracotta"
   ],
   "47 64 139":[
      "blue_glazed_terracotta"
   ],
   "119 106 85":[
      "brown_glazed_terracotta"
   ],
   "52 118 125":[
      "cyan_glazed_terracotta"
   ],
   "83 90 93":[
      "gray_glazed_terracotta"
   ],
   "117 142 67":[
      "green_glazed_terracotta"
   ],
   "94 164 208":[
      "light_blue_glazed_terracotta"
   ],
   "162 197 55":[
      "lime_glazed_terracotta"
   ],
   "208 100 191":[
      "magenta_glazed_terracotta"
   ],
   "154 147 91":[
      "orange_glazed_terracotta"
   ],
   "235 154 181":[
      "pink_glazed_terracotta"
   ],
   "109 48 152":[
      "purple_glazed_terracotta"
   ],
   "181 59 53":[
      "red_glazed_terracotta"
   ],
   "188 212 202":[
      "white_glazed_terracotta"
   ],
   "234 192 88":[
      "yellow_glazed_terracotta"
   ],
   "143 118 69":[
      "glowstone"
   ],
   "249 236 78":[
      "gold_block"
   ],
   "143 139 124":[
      "gold_ore"
   ],
   "125 173 255":[
      "ice"
   ],
   "165 194 245":[
      "packed_ice"
   ],
   "219 219 219":[
      "iron_block"
   ],
   "135 130 126":[
      "iron_ore"
   ],
   "38 67 137":[
      "lapis_block"
   ],
   "102 112 134":[
      "lapis_ore"
   ],
   "105 99 89":[
      "acacia_wood"
   ],
   "52 40 23":[
      "dark_oak_wood"
   ],
   "206 206 201":[
      "birch_wood"
   ],
   "87 67 26":[
      "jungle_wood"
   ],
   "102 81 49":[
      "oak_wood"
   ],
   "45 28 12":[
      "spruce_wood"
   ],
   "141 145 36":[
      "melon"
   ],
   "113 88 73":[
      "mycelium"
   ],
   "111 54 52":[
      "netherrack"
   ],
   "100 67 50":[
      "note_block"
   ],
   "20 18 29":[
      "obsidian"
   ],
   "169 91 51":[
      "acacia_planks"
   ],
   "61 39 18":[
      "dark_oak_planks"
   ],
   "195 179 123":[
      "birch_planks"
   ],
   "154 110 77":[
      "jungle_planks"
   ],
   "156 127 78":[
      "oak_planks"
   ],
   "103 77 46":[
      "spruce_planks"
   ],
   "236 233 226":[
      "quartz_block"
   ],
   "125 84 79":[
      "nether_quartz_ore"
   ],
   "171 27 9":[
      "redstone_block"
   ],
   "70 43 26":[
      "redstone_lamp"
   ],
   "132 107 107":[
      "redstone_ore"
   ],
   "215 208 154":[
      "sandstone"
   ],
   "216 209 157":[
      "sandstone"
   ],
   "219 211 161":[
      "sandstone"
   ],
   "84 64 51":[
      "soul_sand"
   ],
   "125 125 125":[
      "stone"
   ],
   "114 119 106":[
      "mossy_stone_bricks"
   ],
   "130 131 131":[
      "andesite"
   ],
   "133 133 134":[
      "polished_andesite"
   ],
   "179 179 182":[
      "diorite"
   ],
   "183 183 185":[
      "polished_diorite"
   ],
   "153 113 98":[
      "granite"
   ],
   "159 114 98":[
      "polished_granite"
   ],
   "20 21 25":[
      "black_wool"
   ],
   "53 57 157":[
      "blue_wool"
   ],
   "114 71 40":[
      "brown_wool"
   ],
   "21 137 145":[
      "cyan_wool"
   ],
   "62 68 71":[
      "gray_wool"
   ],
   "84 109 27":[
      "green_wool"
   ],
   "58 175 217":[
      "light_blue_wool"
   ],
   "112 185 25":[
      "lime_wool"
   ],
   "189 68 179":[
      "magenta_wool"
   ],
   "240 118 19":[
      "orange_wool"
   ],
   "237 141 172":[
      "pink_wool"
   ],
   "121 42 172":[
      "purple_wool"
   ],
   "160 39 34":[
      "red_wool"
   ],
   "233 236 236":[
      "white_wool"
   ],
   "248 197 39":[
      "yellow_wool"
   ]
}


# INSERT VARIABLES HERE
EPISODE_STRING = "ten"
SEASON_NUM = "01"
EPISODE_NUM = "10"
BEGINNING_FRAME = 104
EPISODE_FRAMES = 1414
#


# do this tmr


frame_rgb_data1 = {}
frame_rgb_data2 = {}
frame_rgb_data3 = {}
frame_rgb_data4 = {}
frame_rgb_data5 = {}
frame_rgb_data6 = {}
frame_rgb_data7 = {}
frame_rgb_data8 = {}
frame_rgb_data9 = {}
frame_rgb_data10 = {}
frame_rgb_data11 = {}

# spongebob frames
# 15-103 frames is the title sequence :D

for spongebob_frame in range(BEGINNING_FRAME, EPISODE_FRAMES+1):
    os.system('cls')
    print(f"On frame: {spongebob_frame}")

    frame_string_string = ""

    if spongebob_frame < 10:
        frame_string_string = f"000{spongebob_frame}"
    elif spongebob_frame < 100:
        frame_string_string = f"00{spongebob_frame}"
    elif spongebob_frame < 1000:
        frame_string_string = f"0{spongebob_frame}"
    else:
        frame_string_string = f"{spongebob_frame}"

    while not os.path.exists(f"./ep_{EPISODE_STRING}/images/{frame_string_string}.png"):
        for i in reversed(range(1, 16)):
            os.system('cls')
            print(f"On frame: {frame_string_string}")
            print(f"Waiting {i} seconds for the image to get downloaded...")
            time.sleep(1)

        os.system('cls')
        print(f"On frame: {frame_string_string}")

    testimage = Image.open(f"./ep_{EPISODE_STRING}/images/{frame_string_string}.png")
    height = testimage.height
    width = testimage.width
    testimage_rgb = testimage.convert("RGB")

    if height+4>=255:
        print("Image is too big!")
        exit()


    def closest_color(rgb):
        r, g, b = rgb
        color_diffs = []
        for color in COLORS["blocks_rgb"]:
            cr, cg, cb = color
            color_diff = sqrt(abs(r - cr)**2 + abs(g - cg)**2 + abs(b - cb)**2)
            color_diffs.append((color_diff, color))
        return min(color_diffs)[1]


    made_changes = False

    for y in range(0, height):
        for x in range(0, width):
            if spongebob_frame < 135:
                if not frame_string_string in frame_rgb_data1:
                    rgbpixel = testimage_rgb.getpixel((x,y))
                    red = rgbpixel[0]
                    green = rgbpixel[1]
                    blue = rgbpixel[2]
                    closestcolor = closest_color((red, green, blue))

                    get_block_key = f"{closestcolor[0]} {closestcolor[1]} {closestcolor[2]}"
                    get_block = COLORS[get_block_key][0]

                    frame_rgb_data1[frame_string_string] = []
                    frame_rgb_data1[frame_string_string].append([])
                    frame_rgb_data1[frame_string_string][0].append(get_block)
                    made_changes = True
                elif len(frame_rgb_data1[frame_string_string]) == y:
                    rgbpixel = testimage_rgb.getpixel((x,y))
                    red = rgbpixel[0]
                    green = rgbpixel[1]
                    blue = rgbpixel[2]
                    closestcolor = closest_color((red, green, blue))

                    get_block_key = f"{closestcolor[0]} {closestcolor[1]} {closestcolor[2]}"
                    get_block = COLORS[get_block_key][0]

                    frame_rgb_data1[frame_string_string].append([])
                    frame_rgb_data1[frame_string_string][y].append(get_block)
                    made_changes = True
                elif len(frame_rgb_data1[frame_string_string][y]) + 1 > x:
                    rgbpixel = testimage_rgb.getpixel((x,y))
                    red = rgbpixel[0]
                    green = rgbpixel[1]
                    blue = rgbpixel[2]
                    closestcolor = closest_color((red, green, blue))

                    get_block_key = f"{closestcolor[0]} {closestcolor[1]} {closestcolor[2]}"
                    get_block = COLORS[get_block_key][0]

                    frame_rgb_data1[frame_string_string][y].append(get_block)
                    made_changes = True
            elif spongebob_frame < 270:
                if not frame_string_string in frame_rgb_data2:
                    rgbpixel = testimage_rgb.getpixel((x,y))
                    red = rgbpixel[0]
                    green = rgbpixel[1]
                    blue = rgbpixel[2]
                    closestcolor = closest_color((red, green, blue))

                    get_block_key = f"{closestcolor[0]} {closestcolor[1]} {closestcolor[2]}"
                    get_block = COLORS[get_block_key][0]

                    frame_rgb_data2[frame_string_string] = []
                    frame_rgb_data2[frame_string_string].append([])
                    frame_rgb_data2[frame_string_string][0].append(get_block)
                    made_changes = True
                elif len(frame_rgb_data2[frame_string_string]) == y:
                    rgbpixel = testimage_rgb.getpixel((x,y))
                    red = rgbpixel[0]
                    green = rgbpixel[1]
                    blue = rgbpixel[2]
                    closestcolor = closest_color((red, green, blue))

                    get_block_key = f"{closestcolor[0]} {closestcolor[1]} {closestcolor[2]}"
                    get_block = COLORS[get_block_key][0]

                    frame_rgb_data2[frame_string_string].append([])
                    frame_rgb_data2[frame_string_string][y].append(get_block)
                    made_changes = True
                elif len(frame_rgb_data2[frame_string_string][y]) + 1 > x:
                    rgbpixel = testimage_rgb.getpixel((x,y))
                    red = rgbpixel[0]
                    green = rgbpixel[1]
                    blue = rgbpixel[2]
                    closestcolor = closest_color((red, green, blue))

                    get_block_key = f"{closestcolor[0]} {closestcolor[1]} {closestcolor[2]}"
                    get_block = COLORS[get_block_key][0]

                    frame_rgb_data2[frame_string_string][y].append(get_block)
                    made_changes = True
            elif spongebob_frame < 405:
                if not frame_string_string in frame_rgb_data3:
                    rgbpixel = testimage_rgb.getpixel((x,y))
                    red = rgbpixel[0]
                    green = rgbpixel[1]
                    blue = rgbpixel[2]
                    closestcolor = closest_color((red, green, blue))

                    get_block_key = f"{closestcolor[0]} {closestcolor[1]} {closestcolor[2]}"
                    get_block = COLORS[get_block_key][0]

                    frame_rgb_data3[frame_string_string] = []
                    frame_rgb_data3[frame_string_string].append([])
                    frame_rgb_data3[frame_string_string][0].append(get_block)
                    made_changes = True
                elif len(frame_rgb_data3[frame_string_string]) == y:
                    rgbpixel = testimage_rgb.getpixel((x,y))
                    red = rgbpixel[0]
                    green = rgbpixel[1]
                    blue = rgbpixel[2]
                    closestcolor = closest_color((red, green, blue))

                    get_block_key = f"{closestcolor[0]} {closestcolor[1]} {closestcolor[2]}"
                    get_block = COLORS[get_block_key][0]

                    frame_rgb_data3[frame_string_string].append([])
                    frame_rgb_data3[frame_string_string][y].append(get_block)
                    made_changes = True
                elif len(frame_rgb_data3[frame_string_string][y]) + 1 > x:
                    rgbpixel = testimage_rgb.getpixel((x,y))
                    red = rgbpixel[0]
                    green = rgbpixel[1]
                    blue = rgbpixel[2]
                    closestcolor = closest_color((red, green, blue))

                    get_block_key = f"{closestcolor[0]} {closestcolor[1]} {closestcolor[2]}"
                    get_block = COLORS[get_block_key][0]

                    frame_rgb_data3[frame_string_string][y].append(get_block)
                    made_changes = True
            elif spongebob_frame < 540:
                if not frame_string_string in frame_rgb_data4:
                    rgbpixel = testimage_rgb.getpixel((x,y))
                    red = rgbpixel[0]
                    green = rgbpixel[1]
                    blue = rgbpixel[2]
                    closestcolor = closest_color((red, green, blue))

                    get_block_key = f"{closestcolor[0]} {closestcolor[1]} {closestcolor[2]}"
                    get_block = COLORS[get_block_key][0]

                    frame_rgb_data4[frame_string_string] = []
                    frame_rgb_data4[frame_string_string].append([])
                    frame_rgb_data4[frame_string_string][0].append(get_block)
                    made_changes = True
                elif len(frame_rgb_data4[frame_string_string]) == y:
                    rgbpixel = testimage_rgb.getpixel((x,y))
                    red = rgbpixel[0]
                    green = rgbpixel[1]
                    blue = rgbpixel[2]
                    closestcolor = closest_color((red, green, blue))

                    get_block_key = f"{closestcolor[0]} {closestcolor[1]} {closestcolor[2]}"
                    get_block = COLORS[get_block_key][0]

                    frame_rgb_data4[frame_string_string].append([])
                    frame_rgb_data4[frame_string_string][y].append(get_block)
                    made_changes = True
                elif len(frame_rgb_data4[frame_string_string][y]) + 1 > x:
                    rgbpixel = testimage_rgb.getpixel((x,y))
                    red = rgbpixel[0]
                    green = rgbpixel[1]
                    blue = rgbpixel[2]
                    closestcolor = closest_color((red, green, blue))

                    get_block_key = f"{closestcolor[0]} {closestcolor[1]} {closestcolor[2]}"
                    get_block = COLORS[get_block_key][0]

                    frame_rgb_data4[frame_string_string][y].append(get_block)
                    made_changes = True
            elif spongebob_frame < 675:
                if not frame_string_string in frame_rgb_data5:
                    rgbpixel = testimage_rgb.getpixel((x,y))
                    red = rgbpixel[0]
                    green = rgbpixel[1]
                    blue = rgbpixel[2]
                    closestcolor = closest_color((red, green, blue))

                    get_block_key = f"{closestcolor[0]} {closestcolor[1]} {closestcolor[2]}"
                    get_block = COLORS[get_block_key][0]

                    frame_rgb_data5[frame_string_string] = []
                    frame_rgb_data5[frame_string_string].append([])
                    frame_rgb_data5[frame_string_string][0].append(get_block)
                    made_changes = True
                elif len(frame_rgb_data5[frame_string_string]) == y:
                    rgbpixel = testimage_rgb.getpixel((x,y))
                    red = rgbpixel[0]
                    green = rgbpixel[1]
                    blue = rgbpixel[2]
                    closestcolor = closest_color((red, green, blue))

                    get_block_key = f"{closestcolor[0]} {closestcolor[1]} {closestcolor[2]}"
                    get_block = COLORS[get_block_key][0]

                    frame_rgb_data5[frame_string_string].append([])
                    frame_rgb_data5[frame_string_string][y].append(get_block)
                    made_changes = True
                elif len(frame_rgb_data5[frame_string_string][y]) + 1 > x:
                    rgbpixel = testimage_rgb.getpixel((x,y))
                    red = rgbpixel[0]
                    green = rgbpixel[1]
                    blue = rgbpixel[2]
                    closestcolor = closest_color((red, green, blue))

                    get_block_key = f"{closestcolor[0]} {closestcolor[1]} {closestcolor[2]}"
                    get_block = COLORS[get_block_key][0]

                    frame_rgb_data5[frame_string_string][y].append(get_block)
                    made_changes = True
            elif spongebob_frame < 810:
                if not frame_string_string in frame_rgb_data6:
                    rgbpixel = testimage_rgb.getpixel((x,y))
                    red = rgbpixel[0]
                    green = rgbpixel[1]
                    blue = rgbpixel[2]
                    closestcolor = closest_color((red, green, blue))

                    get_block_key = f"{closestcolor[0]} {closestcolor[1]} {closestcolor[2]}"
                    get_block = COLORS[get_block_key][0]

                    frame_rgb_data6[frame_string_string] = []
                    frame_rgb_data6[frame_string_string].append([])
                    frame_rgb_data6[frame_string_string][0].append(get_block)
                    made_changes = True
                elif len(frame_rgb_data6[frame_string_string]) == y:
                    rgbpixel = testimage_rgb.getpixel((x,y))
                    red = rgbpixel[0]
                    green = rgbpixel[1]
                    blue = rgbpixel[2]
                    closestcolor = closest_color((red, green, blue))

                    get_block_key = f"{closestcolor[0]} {closestcolor[1]} {closestcolor[2]}"
                    get_block = COLORS[get_block_key][0]

                    frame_rgb_data6[frame_string_string].append([])
                    frame_rgb_data6[frame_string_string][y].append(get_block)
                    made_changes = True
                elif len(frame_rgb_data6[frame_string_string][y]) + 1 > x:
                    rgbpixel = testimage_rgb.getpixel((x,y))
                    red = rgbpixel[0]
                    green = rgbpixel[1]
                    blue = rgbpixel[2]
                    closestcolor = closest_color((red, green, blue))

                    get_block_key = f"{closestcolor[0]} {closestcolor[1]} {closestcolor[2]}"
                    get_block = COLORS[get_block_key][0]

                    frame_rgb_data6[frame_string_string][y].append(get_block)
                    made_changes = True
            elif spongebob_frame < 945:
                if not frame_string_string in frame_rgb_data7:
                    rgbpixel = testimage_rgb.getpixel((x,y))
                    red = rgbpixel[0]
                    green = rgbpixel[1]
                    blue = rgbpixel[2]
                    closestcolor = closest_color((red, green, blue))

                    get_block_key = f"{closestcolor[0]} {closestcolor[1]} {closestcolor[2]}"
                    get_block = COLORS[get_block_key][0]

                    frame_rgb_data7[frame_string_string] = []
                    frame_rgb_data7[frame_string_string].append([])
                    frame_rgb_data7[frame_string_string][0].append(get_block)
                    made_changes = True
                elif len(frame_rgb_data7[frame_string_string]) == y:
                    rgbpixel = testimage_rgb.getpixel((x,y))
                    red = rgbpixel[0]
                    green = rgbpixel[1]
                    blue = rgbpixel[2]
                    closestcolor = closest_color((red, green, blue))

                    get_block_key = f"{closestcolor[0]} {closestcolor[1]} {closestcolor[2]}"
                    get_block = COLORS[get_block_key][0]

                    frame_rgb_data7[frame_string_string].append([])
                    frame_rgb_data7[frame_string_string][y].append(get_block)
                    made_changes = True
                elif len(frame_rgb_data7[frame_string_string][y]) + 1 > x:
                    rgbpixel = testimage_rgb.getpixel((x,y))
                    red = rgbpixel[0]
                    green = rgbpixel[1]
                    blue = rgbpixel[2]
                    closestcolor = closest_color((red, green, blue))

                    get_block_key = f"{closestcolor[0]} {closestcolor[1]} {closestcolor[2]}"
                    get_block = COLORS[get_block_key][0]

                    frame_rgb_data7[frame_string_string][y].append(get_block)
                    made_changes = True
            elif spongebob_frame < 1080:
                if not frame_string_string in frame_rgb_data8:
                    rgbpixel = testimage_rgb.getpixel((x,y))
                    red = rgbpixel[0]
                    green = rgbpixel[1]
                    blue = rgbpixel[2]
                    closestcolor = closest_color((red, green, blue))

                    get_block_key = f"{closestcolor[0]} {closestcolor[1]} {closestcolor[2]}"
                    get_block = COLORS[get_block_key][0]

                    frame_rgb_data8[frame_string_string] = []
                    frame_rgb_data8[frame_string_string].append([])
                    frame_rgb_data8[frame_string_string][0].append(get_block)
                    made_changes = True
                elif len(frame_rgb_data8[frame_string_string]) == y:
                    rgbpixel = testimage_rgb.getpixel((x,y))
                    red = rgbpixel[0]
                    green = rgbpixel[1]
                    blue = rgbpixel[2]
                    closestcolor = closest_color((red, green, blue))

                    get_block_key = f"{closestcolor[0]} {closestcolor[1]} {closestcolor[2]}"
                    get_block = COLORS[get_block_key][0]

                    frame_rgb_data8[frame_string_string].append([])
                    frame_rgb_data8[frame_string_string][y].append(get_block)
                    made_changes = True
                elif len(frame_rgb_data8[frame_string_string][y]) + 1 > x:
                    rgbpixel = testimage_rgb.getpixel((x,y))
                    red = rgbpixel[0]
                    green = rgbpixel[1]
                    blue = rgbpixel[2]
                    closestcolor = closest_color((red, green, blue))

                    get_block_key = f"{closestcolor[0]} {closestcolor[1]} {closestcolor[2]}"
                    get_block = COLORS[get_block_key][0]

                    frame_rgb_data8[frame_string_string][y].append(get_block)
                    made_changes = True
            elif spongebob_frame < 1215:
                if not frame_string_string in frame_rgb_data9:
                    rgbpixel = testimage_rgb.getpixel((x,y))
                    red = rgbpixel[0]
                    green = rgbpixel[1]
                    blue = rgbpixel[2]
                    closestcolor = closest_color((red, green, blue))

                    get_block_key = f"{closestcolor[0]} {closestcolor[1]} {closestcolor[2]}"
                    get_block = COLORS[get_block_key][0]

                    frame_rgb_data9[frame_string_string] = []
                    frame_rgb_data9[frame_string_string].append([])
                    frame_rgb_data9[frame_string_string][0].append(get_block)
                    made_changes = True
                elif len(frame_rgb_data9[frame_string_string]) == y:
                    rgbpixel = testimage_rgb.getpixel((x,y))
                    red = rgbpixel[0]
                    green = rgbpixel[1]
                    blue = rgbpixel[2]
                    closestcolor = closest_color((red, green, blue))

                    get_block_key = f"{closestcolor[0]} {closestcolor[1]} {closestcolor[2]}"
                    get_block = COLORS[get_block_key][0]

                    frame_rgb_data9[frame_string_string].append([])
                    frame_rgb_data9[frame_string_string][y].append(get_block)
                    made_changes = True
                elif len(frame_rgb_data9[frame_string_string][y]) + 1 > x:
                    rgbpixel = testimage_rgb.getpixel((x,y))
                    red = rgbpixel[0]
                    green = rgbpixel[1]
                    blue = rgbpixel[2]
                    closestcolor = closest_color((red, green, blue))

                    get_block_key = f"{closestcolor[0]} {closestcolor[1]} {closestcolor[2]}"
                    get_block = COLORS[get_block_key][0]

                    frame_rgb_data9[frame_string_string][y].append(get_block)
                    made_changes = True
            elif spongebob_frame < 1350:
                if not frame_string_string in frame_rgb_data10:
                    rgbpixel = testimage_rgb.getpixel((x,y))
                    red = rgbpixel[0]
                    green = rgbpixel[1]
                    blue = rgbpixel[2]
                    closestcolor = closest_color((red, green, blue))

                    get_block_key = f"{closestcolor[0]} {closestcolor[1]} {closestcolor[2]}"
                    get_block = COLORS[get_block_key][0]

                    frame_rgb_data10[frame_string_string] = []
                    frame_rgb_data10[frame_string_string].append([])
                    frame_rgb_data10[frame_string_string][0].append(get_block)
                    made_changes = True
                elif len(frame_rgb_data10[frame_string_string]) == y:
                    rgbpixel = testimage_rgb.getpixel((x,y))
                    red = rgbpixel[0]
                    green = rgbpixel[1]
                    blue = rgbpixel[2]
                    closestcolor = closest_color((red, green, blue))

                    get_block_key = f"{closestcolor[0]} {closestcolor[1]} {closestcolor[2]}"
                    get_block = COLORS[get_block_key][0]

                    frame_rgb_data10[frame_string_string].append([])
                    frame_rgb_data10[frame_string_string][y].append(get_block)
                    made_changes = True
                elif len(frame_rgb_data10[frame_string_string][y]) + 1 > x:
                    rgbpixel = testimage_rgb.getpixel((x,y))
                    red = rgbpixel[0]
                    green = rgbpixel[1]
                    blue = rgbpixel[2]
                    closestcolor = closest_color((red, green, blue))

                    get_block_key = f"{closestcolor[0]} {closestcolor[1]} {closestcolor[2]}"
                    get_block = COLORS[get_block_key][0]

                    frame_rgb_data10[frame_string_string][y].append(get_block)
                    made_changes = True
            else:
                if not frame_string_string in frame_rgb_data11:
                    rgbpixel = testimage_rgb.getpixel((x,y))
                    red = rgbpixel[0]
                    green = rgbpixel[1]
                    blue = rgbpixel[2]
                    closestcolor = closest_color((red, green, blue))

                    get_block_key = f"{closestcolor[0]} {closestcolor[1]} {closestcolor[2]}"
                    get_block = COLORS[get_block_key][0]

                    frame_rgb_data11[frame_string_string] = []
                    frame_rgb_data11[frame_string_string].append([])
                    frame_rgb_data11[frame_string_string][0].append(get_block)
                    made_changes = True
                elif len(frame_rgb_data11[frame_string_string]) == y:
                    rgbpixel = testimage_rgb.getpixel((x,y))
                    red = rgbpixel[0]
                    green = rgbpixel[1]
                    blue = rgbpixel[2]
                    closestcolor = closest_color((red, green, blue))

                    get_block_key = f"{closestcolor[0]} {closestcolor[1]} {closestcolor[2]}"
                    get_block = COLORS[get_block_key][0]

                    frame_rgb_data11[frame_string_string].append([])
                    frame_rgb_data11[frame_string_string][y].append(get_block)
                    made_changes = True
                elif len(frame_rgb_data11[frame_string_string][y]) + 1 > x:
                    rgbpixel = testimage_rgb.getpixel((x,y))
                    red = rgbpixel[0]
                    green = rgbpixel[1]
                    blue = rgbpixel[2]
                    closestcolor = closest_color((red, green, blue))

                    get_block_key = f"{closestcolor[0]} {closestcolor[1]} {closestcolor[2]}"
                    get_block = COLORS[get_block_key][0]

                    frame_rgb_data11[frame_string_string][y].append(get_block)
                    made_changes = True
            

    if made_changes:
        if spongebob_frame < 135:
            with open(f"./ep_{EPISODE_STRING}/rgb_values_1.json", "w") as outfile: 
                json.dump(frame_rgb_data1, outfile)
        elif spongebob_frame < 270:
            with open(f"./ep_{EPISODE_STRING}/rgb_values_2.json", "w") as outfile: 
                json.dump(frame_rgb_data2, outfile)
        elif spongebob_frame < 405:
            with open(f"./ep_{EPISODE_STRING}/rgb_values_3.json", "w") as outfile: 
                json.dump(frame_rgb_data3, outfile)
        elif spongebob_frame < 540:
            with open(f"./ep_{EPISODE_STRING}/rgb_values_4.json", "w") as outfile: 
                json.dump(frame_rgb_data4, outfile)
        elif spongebob_frame < 675:
            with open(f"./ep_{EPISODE_STRING}/rgb_values_5.json", "w") as outfile: 
                json.dump(frame_rgb_data5, outfile)
        elif spongebob_frame < 810:
            with open(f"./ep_{EPISODE_STRING}/rgb_values_6.json", "w") as outfile: 
                json.dump(frame_rgb_data6, outfile)
        elif spongebob_frame < 945:
            with open(f"./ep_{EPISODE_STRING}/rgb_values_7.json", "w") as outfile: 
                json.dump(frame_rgb_data7, outfile)
        elif spongebob_frame < 1080:
            with open(f"./ep_{EPISODE_STRING}/rgb_values_8.json", "w") as outfile: 
                json.dump(frame_rgb_data8, outfile)
        elif spongebob_frame < 1215:
            with open(f"./ep_{EPISODE_STRING}/rgb_values_9.json", "w") as outfile: 
                json.dump(frame_rgb_data9, outfile)
        elif spongebob_frame < 1350:
            with open(f"./ep_{EPISODE_STRING}/rgb_values_10.json", "w") as outfile:
                json.dump(frame_rgb_data10, outfile)
        else:
            with open(f"./ep_{EPISODE_STRING}/rgb_values_11.json", "w") as outfile:
                json.dump(frame_rgb_data11, outfile)

    print(f"Finished frame: {frame_string_string}")
