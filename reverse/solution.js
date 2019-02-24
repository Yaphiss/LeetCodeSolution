/**
 * 数字转数组反转
 * @param {*} num 
 */
function solution (num) {
    const sign = Math.sign(num)
    const reverse = (Math.abs(num)+'').split('').reverse()
    const result = sign * parseInt(reverse.join(''))
    if(result > Math.pow(2, 31) - 1 || result < Math.pow(-2, 31)) return 0
    return result
}

/**
 * 递归计算反转
 * @param {*} num 
 */
function solution2 (num) {
    const origin = num
    let n = 0
    while(num > 0) {
        n = n * 10 + n % 10
        num = parseInt(num / 10)
    }
    return origin === n
}
