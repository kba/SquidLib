package squidpony.examples;

import squidpony.squidgrid.mapping.DungeonGenerator;
import squidpony.squidgrid.mapping.DungeonUtility;
import squidpony.squidgrid.mapping.styled.TilesetType;

/**
 * Sample output: {@code
############################################################
##..############~~###...##########..######......#.....^...##
#...####.....###.~.+....#########....#####......#.....+....#
#...####.....###.~.+..........###....#####......#..####....#
#......#.....###..##..........####..#######....##^.####....#
#......#.....###..##...^............########++###++####....#
#......#..........##.^.....................+.......#.......#
#......#..........###..^......###..........+.......#.......#
##.....#####......###........#######++######..######..######
##.....#####......#####...^.#####......#####..######++######
####..######++############++#####......###.....#####......##
####.....###..######........#####......##........####.....##
####......##..####..........^~~~#......##........#..##.....#
######....##..####....#####.~~~~#########..####..#...##....#
#.####....##..######..+...#++#~~~~~~~~###++#..#..#....###..#
#..###..^.##..######..+...#..#~~~~~~~~..+.~#..#..#...^.#####
#..###..........##....#...#..#.~#~~~~~..~~~#...^........####
#..###..........##....#####++####~~~~####~~#...............#
#..+.....#####..####.........####~~~~####~~#..######.......#
#..+..^..#####..#####.......#####~~~~####~~#..^..###.....###
############.....#####..#########~~~~~###~~#.....#####..####
############^....#####..###~~~~#~~~~#####~~#.....#####...###
#....#######.....#..##....#~~~~~~~~~~~~~~~~#..#..######...##
#....#....#####..#..##....#~~~~~~~~~~~~~~~~#..#..#...###..##
###..#....#####..#..####..#~~^~#~~##########..####....##..##
#...^...............####..######~~#~~~~##.............##++##
#.........................#~~~~~~~~~~~~##.............##...#
#.......^.######..........#~~~~~~~~~~~~##.....^.##....##...#
#........#######...#####..######^~#~~~~##.......###...#....#
###.....###...##...#####++######~~#########.....###.......##
######..###...##...###..^..#####~~#########.....###......###
#.......###...########.....#####~~###....#....#######...####
#.............########.....#####~~~~#............+..#..#####
#.............^.....###...######~~~~#............+..########
#++#######..........####++########~~#....#..######...###...#
#...#...##...............^########~~######++#....#....##..^#
#...#...##................#.~~~~~~~~#............#.....#...#
#...#...###.........#.....#~~~~~~~~~#............##........#
#.......###.......^##++####~~#####~~######..#....##........#
##......#####.....###..+.~~~~#####~~######..#########.....##
##.....#########..###..+.~~~~###..~~.#####..############..##
#.......#..+...#..#############....~...###++############..##
#.......#..+...+............###............^..#....#..^+...#
#.......+..#...+............##....##..........#....#...+...#
##......+..#...#....######..##...####.........#....#..######
################..^.#....#.^.....####.........#^...#.......#
#..+.......+..##....#....#........##..........#....#.......#
#..+.......+..##++###.......##................#....+..#..^.#
####++######......###.......####......######..#....+..#....#
####..######......########..#####....#######..######..#....#
####..######.^....#####.~...##############...^.#####......##
#........##........+..##.....#############...#######......##
#........##........+..###.......###########++#...#........##
#........##^...#####..###........#####~~~~#..#...#.....^..##
#........##....#####++###........####~~~~~#..#^..#...#..####
#..########....###....###.........##~~~~~~#..#...#...#..####
#..............###^...###..........~~~~~~~...........#..####
#..............###....##.....##.....~~~~~~.......^...#..####
###########.....#######......##.^...~~.##~.......#####..####
############################################################
 *
 * }
 * Created by Tommy Ettinger on 4/8/2015.
 */
public class DungeonGeneratorTest {
    public static void main( String[] args )
    {
        DungeonGenerator dungeonGenerator = new DungeonGenerator(120, 60);
        dungeonGenerator.addDoors(15, true);
        dungeonGenerator.addWater(25);
        dungeonGenerator.addTraps(2);
        dungeonGenerator.generate(TilesetType.DEFAULT_DUNGEON);

        dungeonGenerator.setDungeon(DungeonUtility.doubleWidth(
                DungeonUtility.hashesToLines(dungeonGenerator.getDungeon())));
        System.out.println(dungeonGenerator.toString());
    }
}
