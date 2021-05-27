package com.ratkko.spongebob.events;

import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.Material;

import org.bukkit.World;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class events implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {

        String commandName = command.getName().toLowerCase();

        if(!(sender instanceof Player) && commandName.equals("frame") && args.length == 6) {

            Integer starting_x_coord = Integer.parseInt(String.valueOf(args[1]));
            Integer starting_y_coord = Integer.parseInt(String.valueOf(args[2]));
            Integer starting_z_coord = Integer.parseInt(String.valueOf(args[3]));

            Integer direction_coord = Integer.parseInt(String.valueOf(args[4]));

            String world_name = String.valueOf(args[5]);

            // /frame <frame> <x> <y> <z> <direction> <world_name>

            String frame_num = String.valueOf(args[0]);

            JSONObject rgb_values = null;

            String intermission = "./plugins/spongebob_rgb_values/intermission_rgb_value.json";

            if (Integer.parseInt(frame_num) >= 15 && 1100 > Integer.parseInt(frame_num)) {

                String eleven = "./plugins/spongebob_rgb_values/spongebob_ep_one/rgb_values/rgb_values_11.json";
                String ten = "./plugins/spongebob_rgb_values/spongebob_ep_one/rgb_values/rgb_values_10.json";
                String nine = "./plugins/spongebob_rgb_values/spongebob_ep_one/rgb_values/rgb_values_9.json";
                String eight = "./plugins/spongebob_rgb_values/spongebob_ep_one/rgb_values/rgb_values_8.json";
                String seven = "./plugins/spongebob_rgb_values/spongebob_ep_one/rgb_values/rgb_values_7.json";
                String six = "./plugins/spongebob_rgb_values/spongebob_ep_one/rgb_values/rgb_values_6.json";
                String five = "./plugins/spongebob_rgb_values/spongebob_ep_one/rgb_values/rgb_values_5.json";
                String four = "./plugins/spongebob_rgb_values/spongebob_ep_one/rgb_values/rgb_values_4.json";
                String three = "./plugins/spongebob_rgb_values/spongebob_ep_one/rgb_values/rgb_values_3.json";
                String two = "./plugins/spongebob_rgb_values/spongebob_ep_one/rgb_values/rgb_values_2.json";
                String one = "./plugins/spongebob_rgb_values/spongebob_ep_one/rgb_values/rgb_values_1.json";

                if (Integer.parseInt(frame_num) >= 1000 && 1100 > Integer.parseInt(frame_num)) {
                    String rgb_values_raw;
                    try {
                        rgb_values_raw = new String((Files.readAllBytes(Paths.get(eleven))));
                        rgb_values = new JSONObject(rgb_values_raw);
                    } catch (IOException | JSONException ioException) {
                        ioException.printStackTrace();
                    }
                } else if (Integer.parseInt(frame_num) >= 900) {
                    try {
                        String rgb_values_raw = new String((Files.readAllBytes(Paths.get(ten))));
                        rgb_values = new JSONObject(rgb_values_raw);
                    } catch (IOException | JSONException ioException) {
                        ioException.printStackTrace();
                    }
                } else if (Integer.parseInt(frame_num) >= 800) {
                    try {
                        String rgb_values_raw = new String((Files.readAllBytes(Paths.get(nine))));
                        rgb_values = new JSONObject(rgb_values_raw);
                    } catch (IOException | JSONException ioException) {
                        ioException.printStackTrace();
                    }
                } else if (Integer.parseInt(frame_num) >= 700) {
                    try {
                        String rgb_values_raw = new String((Files.readAllBytes(Paths.get(eight))));
                        rgb_values = new JSONObject(rgb_values_raw);
                    } catch (IOException | JSONException ioException) {
                        ioException.printStackTrace();
                    }
                } else if (Integer.parseInt(frame_num) >= 600) {
                    try {
                        String rgb_values_raw = new String((Files.readAllBytes(Paths.get(seven))));
                        rgb_values = new JSONObject(rgb_values_raw);
                    } catch (IOException | JSONException ioException) {
                        ioException.printStackTrace();
                    }
                } else if (Integer.parseInt(frame_num) >= 500) {
                    try {
                        String rgb_values_raw = new String((Files.readAllBytes(Paths.get(six))));
                        rgb_values = new JSONObject(rgb_values_raw);
                    } catch (IOException | JSONException ioException) {
                        ioException.printStackTrace();
                    }
                } else if (Integer.parseInt(frame_num) >= 400) {
                    try {
                        String rgb_values_raw = new String((Files.readAllBytes(Paths.get(five))));
                        rgb_values = new JSONObject(rgb_values_raw);
                    } catch (IOException | JSONException ioException) {
                        ioException.printStackTrace();
                    }
                } else if (Integer.parseInt(frame_num) >= 300) {
                    try {
                        String rgb_values_raw = new String((Files.readAllBytes(Paths.get(four))));
                        rgb_values = new JSONObject(rgb_values_raw);
                    } catch (IOException | JSONException ioException) {
                        ioException.printStackTrace();
                    }
                } else if (Integer.parseInt(frame_num) >= 200) {
                    try {
                        String rgb_values_raw = new String((Files.readAllBytes(Paths.get(three))));
                        rgb_values = new JSONObject(rgb_values_raw);
                    } catch (IOException | JSONException ioException) {
                        ioException.printStackTrace();
                    }
                } else if (Integer.parseInt(frame_num) >= 100) {
                    try {
                        String rgb_values_raw = new String((Files.readAllBytes(Paths.get(two))));
                        rgb_values = new JSONObject(rgb_values_raw);
                    } catch (IOException | JSONException ioException) {
                        ioException.printStackTrace();
                    }
                } else if (Integer.parseInt(frame_num) >= 15) {
                    try {
                        String rgb_values_raw = new String((Files.readAllBytes(Paths.get(one))));
                        rgb_values = new JSONObject(rgb_values_raw);
                    } catch (IOException | JSONException ioException) {
                        ioException.printStackTrace();
                    }
                }
            } else if (Integer.parseInt(frame_num) == 1) {
                try {
                    String rgb_values_raw = new String((Files.readAllBytes(Paths.get(intermission))));
                    rgb_values = new JSONObject(rgb_values_raw);
                } catch (IOException | JSONException ioException) {
                    ioException.printStackTrace();
                }
            } else if (Integer.parseInt(frame_num) >= 1100 && Integer.parseInt(frame_num) < 2515) {
                String eleven = "./plugins/spongebob_rgb_values/spongebob_ep_five/rgb_values/rgb_values_11.json";
                String ten = "./plugins/spongebob_rgb_values/spongebob_ep_five/rgb_values/rgb_values_10.json";
                String nine = "./plugins/spongebob_rgb_values/spongebob_ep_five/rgb_values/rgb_values_9.json";
                String eight = "./plugins/spongebob_rgb_values/spongebob_ep_five/rgb_values/rgb_values_8.json";
                String seven = "./plugins/spongebob_rgb_values/spongebob_ep_five/rgb_values/rgb_values_7.json";
                String six = "./plugins/spongebob_rgb_values/spongebob_ep_five/rgb_values/rgb_values_6.json";
                String five = "./plugins/spongebob_rgb_values/spongebob_ep_five/rgb_values/rgb_values_5.json";
                String four = "./plugins/spongebob_rgb_values/spongebob_ep_five/rgb_values/rgb_values_4.json";
                String three = "./plugins/spongebob_rgb_values/spongebob_ep_five/rgb_values/rgb_values_3.json";
                String two = "./plugins/spongebob_rgb_values/spongebob_ep_five/rgb_values/rgb_values_2.json";
                String one = "./plugins/spongebob_rgb_values/spongebob_ep_five/rgb_values/rgb_values_1.json";

                if (Integer.parseInt(frame_num) >= 2345 && 2515 > Integer.parseInt(frame_num)) {
                    try {
                        String rgb_values_raw = new String((Files.readAllBytes(Paths.get(eleven))));
                        rgb_values = new JSONObject(rgb_values_raw);
                    } catch (IOException | JSONException ioException) {
                        ioException.printStackTrace();
                    }
                } else if (Integer.parseInt(frame_num) >= 2210) {
                    try {
                        String rgb_values_raw = new String((Files.readAllBytes(Paths.get(ten))));
                        rgb_values = new JSONObject(rgb_values_raw);
                    } catch (IOException | JSONException ioException) {
                        ioException.printStackTrace();
                    }
                } else if (Integer.parseInt(frame_num) >= 2075) {
                    try {
                        String rgb_values_raw = new String((Files.readAllBytes(Paths.get(nine))));
                        rgb_values = new JSONObject(rgb_values_raw);
                    } catch (IOException | JSONException ioException) {
                        ioException.printStackTrace();
                    }
                } else if (Integer.parseInt(frame_num) >= 1940) {
                    try {
                        String rgb_values_raw = new String((Files.readAllBytes(Paths.get(eight))));
                        rgb_values = new JSONObject(rgb_values_raw);
                    } catch (IOException | JSONException ioException) {
                        ioException.printStackTrace();
                    }
                } else if (Integer.parseInt(frame_num) >= 1805) {
                    try {
                        String rgb_values_raw = new String((Files.readAllBytes(Paths.get(seven))));
                        rgb_values = new JSONObject(rgb_values_raw);
                    } catch (IOException | JSONException ioException) {
                        ioException.printStackTrace();
                    }
                } else if (Integer.parseInt(frame_num) >= 1670) {
                    try {
                        String rgb_values_raw = new String((Files.readAllBytes(Paths.get(six))));
                        rgb_values = new JSONObject(rgb_values_raw);
                    } catch (IOException | JSONException ioException) {
                        ioException.printStackTrace();
                    }
                } else if (Integer.parseInt(frame_num) >= 1535) {
                    try {
                        String rgb_values_raw = new String((Files.readAllBytes(Paths.get(five))));
                        rgb_values = new JSONObject(rgb_values_raw);
                    } catch (IOException | JSONException ioException) {
                        ioException.printStackTrace();
                    }
                } else if (Integer.parseInt(frame_num) >= 1400) {
                    try {
                        String rgb_values_raw = new String((Files.readAllBytes(Paths.get(four))));
                        rgb_values = new JSONObject(rgb_values_raw);
                    } catch (IOException | JSONException ioException) {
                        ioException.printStackTrace();
                    }
                } else if (Integer.parseInt(frame_num) >= 1265) {
                    try {
                        String rgb_values_raw = new String((Files.readAllBytes(Paths.get(three))));
                        rgb_values = new JSONObject(rgb_values_raw);
                    } catch (IOException | JSONException ioException) {
                        ioException.printStackTrace();
                    }
                } else if (Integer.parseInt(frame_num) >= 1131) {
                    try {
                        String rgb_values_raw = new String((Files.readAllBytes(Paths.get(two))));
                        rgb_values = new JSONObject(rgb_values_raw);
                    } catch (IOException | JSONException ioException) {
                        ioException.printStackTrace();
                    }
                } else if (Integer.parseInt(frame_num) >= 1100) {
                    try {
                        String rgb_values_raw = new String((Files.readAllBytes(Paths.get(one))));
                        rgb_values = new JSONObject(rgb_values_raw);
                    } catch (IOException | JSONException ioException) {
                        ioException.printStackTrace();
                    }
                }
            } else if (Integer.parseInt(frame_num) >= 2600 && Integer.parseInt(frame_num) < 3921) {
                String ten = "./plugins/spongebob_rgb_values/spongebob_ep_ten/rgb_values/rgb_values_10.json";
                String nine = "./plugins/spongebob_rgb_values/spongebob_ep_ten/rgb_values/rgb_values_9.json";
                String eight = "./plugins/spongebob_rgb_values/spongebob_ep_ten/rgb_values/rgb_values_8.json";
                String seven = "./plugins/spongebob_rgb_values/spongebob_ep_ten/rgb_values/rgb_values_7.json";
                String six = "./plugins/spongebob_rgb_values/spongebob_ep_ten/rgb_values/rgb_values_6.json";
                String five = "./plugins/spongebob_rgb_values/spongebob_ep_ten/rgb_values/rgb_values_5.json";
                String four = "./plugins/spongebob_rgb_values/spongebob_ep_ten/rgb_values/rgb_values_4.json";
                String three = "./plugins/spongebob_rgb_values/spongebob_ep_ten/rgb_values/rgb_values_3.json";
                String two = "./plugins/spongebob_rgb_values/spongebob_ep_ten/rgb_values/rgb_values_2.json";
                String one = "./plugins/spongebob_rgb_values/spongebob_ep_ten/rgb_values/rgb_values_1.json";

                if (Integer.parseInt(frame_num) >= 3814) {
                    try {
                        String rgb_values_raw = new String((Files.readAllBytes(Paths.get(ten))));
                        rgb_values = new JSONObject(rgb_values_raw);
                    } catch (IOException | JSONException ioException) {
                        ioException.printStackTrace();
                    }
                } else if (Integer.parseInt(frame_num) >= 3679) {
                    try {
                        String rgb_values_raw = new String((Files.readAllBytes(Paths.get(nine))));
                        rgb_values = new JSONObject(rgb_values_raw);
                    } catch (IOException | JSONException ioException) {
                        ioException.printStackTrace();
                    }
                } else if (Integer.parseInt(frame_num) >= 3544) {
                    try {
                        String rgb_values_raw = new String((Files.readAllBytes(Paths.get(eight))));
                        rgb_values = new JSONObject(rgb_values_raw);
                    } catch (IOException | JSONException ioException) {
                        ioException.printStackTrace();
                    }
                } else if (Integer.parseInt(frame_num) >= 3409) {
                    try {
                        String rgb_values_raw = new String((Files.readAllBytes(Paths.get(seven))));
                        rgb_values = new JSONObject(rgb_values_raw);
                    } catch (IOException | JSONException ioException) {
                        ioException.printStackTrace();
                    }
                } else if (Integer.parseInt(frame_num) >= 3274) {
                    try {
                        String rgb_values_raw = new String((Files.readAllBytes(Paths.get(six))));
                        rgb_values = new JSONObject(rgb_values_raw);
                    } catch (IOException | JSONException ioException) {
                        ioException.printStackTrace();
                    }
                } else if (Integer.parseInt(frame_num) >= 3139) {
                    try {
                        String rgb_values_raw = new String((Files.readAllBytes(Paths.get(five))));
                        rgb_values = new JSONObject(rgb_values_raw);
                    } catch (IOException | JSONException ioException) {
                        ioException.printStackTrace();
                    }
                } else if (Integer.parseInt(frame_num) >= 3004) {
                    try {
                        String rgb_values_raw = new String((Files.readAllBytes(Paths.get(four))));
                        rgb_values = new JSONObject(rgb_values_raw);
                    } catch (IOException | JSONException ioException) {
                        ioException.printStackTrace();
                    }
                } else if (Integer.parseInt(frame_num) >= 2869) {
                    try {
                        String rgb_values_raw = new String((Files.readAllBytes(Paths.get(three))));
                        rgb_values = new JSONObject(rgb_values_raw);
                    } catch (IOException | JSONException ioException) {
                        ioException.printStackTrace();
                    }
                } else if (Integer.parseInt(frame_num) >= 2734) {
                    try {
                        String rgb_values_raw = new String((Files.readAllBytes(Paths.get(two))));
                        rgb_values = new JSONObject(rgb_values_raw);
                    } catch (IOException | JSONException ioException) {
                        ioException.printStackTrace();
                    }
                } else if (Integer.parseInt(frame_num) >= 2600) {
                    try {
                        String rgb_values_raw = new String((Files.readAllBytes(Paths.get(one))));
                        rgb_values = new JSONObject(rgb_values_raw);
                    } catch (IOException | JSONException ioException) {
                        ioException.printStackTrace();
                    }
                }
            }


            if (Integer.parseInt(frame_num) >= 1100 && Integer.parseInt(frame_num) < 2515) {
                Integer temp_frame_num = Integer.parseInt(frame_num);
                temp_frame_num = temp_frame_num - 996;
                frame_num = String.valueOf(temp_frame_num);
            } else if (Integer.parseInt(frame_num) >= 2600 && Integer.parseInt(frame_num) < 3921) {
                Integer temp_frame_num = Integer.parseInt(frame_num);
                temp_frame_num = temp_frame_num - 2599;
                frame_num = String.valueOf(temp_frame_num);
            }

            String frame;
            if (Integer.parseInt(frame_num) < 10) {
                frame = "000" + frame_num;
            } else if (Integer.parseInt(frame_num) < 100) {
                frame = "00" + frame_num;
            } else if (Integer.parseInt(frame_num) < 1000) {
                frame = "0" + frame_num;
            } else {
                frame = frame_num;
            }

            for (int y = 0; y < 45; y++) {
                for (int x = 0; x < 60; x++) {
                    JSONArray get_array;
                    try {
                        assert rgb_values != null;
                        get_array = rgb_values.getJSONArray(frame);
                        JSONArray get_y = get_array.getJSONArray(y);
                        String get_block = get_y.getString(x);
                        Material block_place = get_block(get_block);
                        if (block_place != null) {
                            World over_world = Bukkit.getServer().getWorld(world_name);
                            Location block_loc;
                            if (direction_coord == 0) {
                                block_loc = new Location(over_world, starting_x_coord + x, starting_y_coord - y, starting_z_coord);
                            } else if (direction_coord == 1) {
                                block_loc = new Location(over_world, starting_x_coord - x, starting_y_coord - y, starting_z_coord);
                            } else if (direction_coord == 2) {
                                block_loc = new Location(over_world, starting_x_coord, starting_y_coord - y, starting_z_coord + x);
                            } else if (direction_coord == 3) {
                                block_loc = new Location(over_world, starting_x_coord, starting_y_coord - y, starting_z_coord - x);
                            } else {
                                break;
                            }
                            block_loc.getBlock().setType(block_place);
                        }
                    } catch (JSONException e) {
                        e.printStackTrace();
                    }
                }
            }

        }

        return false;
    }

    public Material get_block(String get_block) {
        switch (get_block) {
            case "bone_block":
                return Material.BONE_BLOCK;
            case "bookshelf":
                return Material.BOOKSHELF;
            case "bricks":
                return Material.BRICKS;
            case "clay":
                return Material.CLAY;
            case "coal_block":
                return Material.COAL_BLOCK;
            case "coal_ore":
                return Material.COAL_ORE;
            case "coarse_dirt":
                return Material.COARSE_DIRT;
            case "cobblestone":
                return Material.COBBLESTONE;
            case "mossy_cobblestone":
                return Material.MOSSY_COBBLESTONE;
            case "black_concrete":
                return Material.BLACK_CONCRETE;
            case "blue_concrete":
                return Material.BLUE_CONCRETE;
            case "brown_concrete":
                return Material.BROWN_CONCRETE;
            case "cyan_concrete":
                return Material.CYAN_CONCRETE;
            case "gray_concrete":
                return Material.GRAY_CONCRETE;
            case "green_concrete":
                return Material.GREEN_CONCRETE;
            case "light_blue_concrete":
                return Material.LIGHT_BLUE_CONCRETE;
            case "lime_concrete":
                return Material.LIME_CONCRETE;
            case "magenta_concrete":
                return Material.MAGENTA_CONCRETE;
            case "orange_concrete":
                return Material.ORANGE_CONCRETE;
            case "pink_concrete":
                return Material.PINK_CONCRETE;
            case "purple_concrete":
                return Material.PURPLE_CONCRETE;
            case "red_concrete":
                return Material.RED_CONCRETE;
            case "white_concrete":
                return Material.WHITE_CONCRETE;
            case "yellow_concrete":
                return Material.YELLOW_CONCRETE;
            case "diamond_block":
                return Material.DIAMOND_BLOCK;
            case "diamond_ore":
                return Material.DIAMOND_ORE;
            case "dirt":
                return Material.DIRT;
            case "emerald_block":
                return Material.EMERALD_BLOCK;
            case "emerald_ore":
                return Material.EMERALD_ORE;
            case "end_stone_bricks":
                return Material.END_STONE_BRICKS;
            case "end_stone":
                return Material.END_STONE;
            case "black_glazed_terracotta":
                return Material.BLACK_GLAZED_TERRACOTTA;
            case "blue_glazed_terracotta":
                return Material.BLUE_GLAZED_TERRACOTTA;
            case "brown_glazed_terracotta":
                return Material.BROWN_GLAZED_TERRACOTTA;
            case "cyan_glazed_terracotta":
                return Material.CYAN_GLAZED_TERRACOTTA;
            case "gray_glazed_terracotta":
                return Material.GRAY_GLAZED_TERRACOTTA;
            case "green_glazed_terracotta":
                return Material.GREEN_GLAZED_TERRACOTTA;
            case "light_blue_glazed_terracotta":
                return Material.LIGHT_BLUE_GLAZED_TERRACOTTA;
            case "lime_glazed_terracotta":
                return Material.LIME_GLAZED_TERRACOTTA;
            case "magenta_glazed_terracotta":
                return Material.MAGENTA_GLAZED_TERRACOTTA;
            case "orange_glazed_terracotta":
                return Material.ORANGE_GLAZED_TERRACOTTA;
            case "pink_glazed_terracotta":
                return Material.PINK_GLAZED_TERRACOTTA;
            case "purple_glazed_terracotta":
                return Material.PURPLE_GLAZED_TERRACOTTA;
            case "red_glazed_terracotta":
                return Material.RED_GLAZED_TERRACOTTA;
            case "white_glazed_terracotta":
                return Material.WHITE_GLAZED_TERRACOTTA;
            case "yellow_glazed_terracotta":
                return Material.YELLOW_GLAZED_TERRACOTTA;
            case "glowstone":
                return Material.GLOWSTONE;
            case "gold_block":
                return Material.GOLD_BLOCK;
            case "gold_ore":
                return Material.GOLD_ORE;
            case "ice":
                return Material.ICE;
            case "packed_ice":
                return Material.PACKED_ICE;
            case "iron_block":
                return Material.IRON_BLOCK;
            case "iron_ore":
                return Material.IRON_ORE;
            case "lapis_block":
                return Material.LAPIS_BLOCK;
            case "lapis_ore":
                return Material.LAPIS_ORE;
            case "acacia_wood":
                return Material.ACACIA_WOOD;
            case "dark_oak_wood":
                return Material.DARK_OAK_WOOD;
            case "birch_wood":
                return Material.BIRCH_WOOD;
            case "jungle_wood":
                return Material.JUNGLE_WOOD;
            case "oak_wood":
                return Material.OAK_WOOD;
            case "spruce_wood":
                return Material.SPRUCE_WOOD;
            case "melon":
                return Material.MELON;
            case "mycelium":
                return Material.MYCELIUM;
            case "netherrack":
                return Material.NETHERRACK;
            case "note_block":
                return Material.NOTE_BLOCK;
            case "obsidian":
                return Material.OBSIDIAN;
            case "acacia_planks":
                return Material.ACACIA_PLANKS;
            case "dark_oak_planks":
                return Material.DARK_OAK_PLANKS;
            case "birch_planks":
                return Material.BIRCH_PLANKS;
            case "jungle_planks":
                return Material.JUNGLE_PLANKS;
            case "oak_planks":
                return Material.OAK_PLANKS;
            case "spruce_planks":
                return Material.SPRUCE_PLANKS;
            case "quartz_block":
                return Material.QUARTZ_BLOCK;
            case "nether_quartz_ore":
                return Material.NETHER_QUARTZ_ORE;
            case "redstone_block":
                return Material.REDSTONE_BLOCK;
            case "redstone_lamp":
                return Material.REDSTONE_LAMP;
            case "redstone_ore":
                return Material.REDSTONE_ORE;
            case "sandstone":
                return Material.SANDSTONE;
            case "soul_sand":
                return Material.SOUL_SAND;
            case "stone":
                return Material.STONE;
            case "mossy_stone_bricks":
                return Material.MOSSY_STONE_BRICKS;
            case "andesite":
                return Material.ANDESITE;
            case "polished_andesite":
                return Material.POLISHED_ANDESITE;
            case "diorite":
                return Material.DIORITE;
            case "polished_diorite":
                return Material.POLISHED_DIORITE;
            case "granite":
                return Material.GRANITE;
            case "polished_granite":
                return Material.POLISHED_GRANITE;
            case "black_wool":
                return Material.BLACK_WOOL;
            case "blue_wool":
                return Material.BLUE_WOOL;
            case "brown_wool":
                return Material.BROWN_WOOL;
            case "cyan_wool":
                return Material.CYAN_WOOL;
            case "gray_wool":
                return Material.GRAY_WOOL;
            case "green_wool":
                return Material.GREEN_WOOL;
            case "light_blue_wool":
                return Material.LIGHT_BLUE_WOOL;
            case "lime_wool":
                return Material.LIME_WOOL;
            case "magenta_wool":
                return Material.MAGENTA_WOOL;
            case "orange_wool":
                return Material.ORANGE_WOOL;
            case "pink_wool":
                return Material.PINK_WOOL;
            case "purple_wool":
                return Material.PURPLE_WOOL;
            case "red_wool":
                return Material.RED_WOOL;
            case "white_wool":
                return Material.WHITE_WOOL;
            case "yellow_wool":
                return Material.YELLOW_WOOL;
        }

        return null;
    }
}