# SceneTeleporter (version 1.0.0)
an attempt to re-implement back the /scene command with a feature to teleport to the start of the map <br>(using the maps `born_pos` metadata)
(instead of just doing a guess-work and manually typing the positions..)

this was built for GrassCutter server version 'grasscutter-1.4.3-dev', <br>earlier versions might not work
(you can try to compile it yourself for your desired version)

## important:
Please do not leave domain via the "leave domain?" question promt, it will not teleport you right <br>
you must use the `/sc <sceneID>` each time you want to go from one scene to another... (except of teleporting back to the points on the world map)
<br>and also please do not teleport to scenes that are time-limited events scene,
since hoyoverse deleted those scenes data and you would just free fall endlessly into the map..
<br> <br>
huge thanks to: snoo x orang for helping me out, thanks man.

# install:
download the jar file and put it in your plugin folder: <br>
`Grasscutter\plugins`

# Usage:
 `/sc <SceneID>` <br>
 or <br>
 `/scene  <SceneID>` <br>
 or <br>
 `/sceneteleport <SceneID>` <br>
 or <br>
 `/sceneteleporter <SceneID>`

(you can find the SceneID in your GM Handbook text file)


# developer info:
scene `born_pos` & `born_rot` metadata is located at:

`Grasscutter\Resources\Scripts\Scene\<your sceneID>`

`born_rot` is for rotation positions but this is not implemented here...

# Known Issues:

* can't teleport to scenes 2 to 9 - there is some weird formatting issue with those for some reason, but i think they not really usable anyway, so meh..
* can't teleport to some scenes - usually its either because they are empty/debug/not supposed to be played or missing info in the scene{sceneid}.lua file in `Grasscutter\Resources\Scripts\Scene\<your sceneID>`
* teleporting to some scenes getting you to a freefall - again as mentioned above, its due to it being empty/debug/not supposed to be played...
