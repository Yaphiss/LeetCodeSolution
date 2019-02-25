function solution (nums, target) {
    let map = {}
    for(let i = 0; i < nums.length; i++) {
        let n = target - nums[i]
        if(map.hasOwdProperty(n)) return [map[n], i]
        map[nums[i]] = i
    }
}