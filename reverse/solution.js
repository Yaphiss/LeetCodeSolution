function solution (num) {
    const sign = Math.sign(num)
    const reverse = (Math.abs(num)+'').split('').reverse()
    const result = sign * parseInt(reverse.join(''))
    if(result > Math.pow(2, 31) - 1 || result < Math.pow(-2, 31)) return 0
    return result
}
