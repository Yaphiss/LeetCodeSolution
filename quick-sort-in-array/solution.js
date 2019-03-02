function solution (nums) {
    const len = nums.length
    if (len <= 1) return nums
    let left = []
    let right = []
    let middle = nums.splice(Math.floor(len/2), 1)
    for(let i = 0; i < nums.length; i++) {
        if (nums[i] < middle) {
            left.push(nums[i])
        }else{
            right.push(nums[i])
        }
    }
    return solution(left).concat(middle, solution(right))
}
console.log(solution([5,7,-5,1,3,4,6,8,10]))