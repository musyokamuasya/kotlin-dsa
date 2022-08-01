class NumberOfIslands {
    fun numIslands(grid: Array<CharArray>?): Int {
        if (grid == null || grid.isEmpty()) return 0
        var numIslands = 0
        for (i in 0..grid.size) {
            for (j in 0..grid[i].size) {
//                 Recursively call dfs
                if (grid[i][j] == '1') {
                    numIslands += dfs(grid, i, j)
                }
            }
        }
        return 0
    }

    fun dfs(grid: Array<CharArray>, i: Int, j: Int): Int {
        if (i < 0 || j < 0 || i >= grid.size || j >= grid[i].size || grid[i][j].equals('0')) return 0
        // Change the 1 to 0 and increment
        grid[i][j] = '0'
        dfs(grid, i + 1, j)
        dfs(grid, i - 1, j)
        dfs(grid, i, j + 1)
        dfs(grid, i, j - 1)
        return 1
    }
}