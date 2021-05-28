# mc-spongebob-plugin
A plugin for Spigot 1.16.5 which can output frames from Spongebob into Minecraft!

( I'm a mega noob so if you find a problem pls reach out! )

![Spongebob Plugin](/spongebob_plugin.png)

# Get started
1. Get Spigot 1.16.5
2. Download code
3. Put all files from the 'plugin' folder into your Minecraft server's 'plugins' folder
4. Hopefully it works :D

# How to use
```
/frame <frame_num> <x> <y> <z> <direction> <world_name>
```

(Only usable by things that aren't players)
  
# Frames
- 1 = Intermission sign
- 15 -> 103 = Intro / Theme
- 104 -> 1097 = Episode One
- 1100 -> 2514 = Episode Ten
- 2600 -> 3920 = Episode Five

# Direction
- 0 = Add to X
- 1 = Subtract from X
- 2 = Add to Z
- 3 = Subtract from Z

# Request frames
1. Download 'spongebob_request_images.py'
2. Change lines 7-11 according to your needs ([go here](http://www.everyframeinorder.com/) to see episodes)
3. Run (Downloads and resizes pngs (60x45) from [http://www.everyframeinorder.com/](http://www.everyframeinorder.com/). Outputs into './ep_{episode string}/images/{image}')
4. Download 'spongebob_rgb_values.py'
5. Change lines 853-857 according to your needs
6. Run (Converts each pixel from './ep_{episode string}/images/{image}' into a Minecraft block. Makes a giant JSON array (frame:[ y:[ x]]). Outputs into './ep_{episode string}/rgb_values_{number}.json'. BIG FILE SIZE!)

# Thanks
Frames are taken from: http://www.everyframeinorder.com/
