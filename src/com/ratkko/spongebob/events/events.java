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



        if(sender.isOp() && command.getLabel().equalsIgnoreCase("frame") && args.length == 6) {

            int starting_x_coord = Integer.parseInt(String.valueOf(args[1]));
            int starting_y_coord = Integer.parseInt(String.valueOf(args[2]));
            int starting_z_coord = Integer.parseInt(String.valueOf(args[3]));
            int direction_coord = Integer.parseInt(String.valueOf(args[4]));
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
                        Material block_place = getBlock.get_block(get_block);
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

}
