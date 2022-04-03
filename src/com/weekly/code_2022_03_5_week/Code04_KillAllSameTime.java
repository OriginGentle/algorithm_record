package com.weekly.code_2022_03_5_week;

/**
 * @author ycb
 * @date 2022/4/3
 * @desc 来自网易
 * 我军一起干掉敌人的最少移动数
 * km算法的又一个题
 * 给定一个矩阵int[][] matrix
 * matrix[i][j] == -2，代表此处(i,j)有山脉，无法通行
 * matrix[i][j] == -1，代表此处(i,j)是一个敌军
 * matrix[i][j] == 0，代表此处(i,j)是空地，可以自由行动
 * matrix[i][j] > 0，代表此处(i,j)是一个我军，行动能力就是matrix[i][j]
 * 我军只能上、下、左、右移动，只可以穿过同样是我军的地点和空地的地点，但是最多移动matrix[i][j]步
 * 任何一个我军都不能穿过山脉，任何一个我军可以来到敌军的位置，表示消灭了敌军，但是如果这么做了，这个我军就不能再移动了
 * 你可以任意决定所有我军的行动策略，每一步你都可以随意选择一个友军移动随意方向的，但是必须合法。
 * 如果你可以让所有我军在消耗完自身的行动能力之前，消灭所有的敌军，请返回总距离的最小值
 */
public class Code04_KillAllSameTime {
}
