function solution (x) {
    if (Math.sign(x) === -1) return false
    const origin = x
    let num = 0
    while (x > 0) {
        num = num * 10 + x % 10
        x = parseInt(x/10)
    }
    return origin === num
}