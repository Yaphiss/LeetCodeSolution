function sort (nums) {
    if(!nums.length) return []
    let tmp
    for (let i = 0; i < nums.length - 1; i++) {
        for (let j = 0; j < nums.length - 1 - i; j++) {
            if (nums[j] > nums[j + 1]) {
                tmp = nums[j]
                nums[j] = nums[j+1]
                nums[j+1] = tmp
            }
        }
    }
    return nums
}