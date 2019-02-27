function solution () {
    let result = {}
    deck.forEach(item => {
        if (result[item]) {
        ++result[item]
        } else {
        result[item] = 1
        }
    })

    // 求最小公倍数, 先假设为2
    result = Object.values(result)
    const min = Math.min(...result)
    if (min < 2) {
        return false
    }
    for (let tmp = 2; tmp <= min;) {
        if (result.every(item => item % tmp === 0)) {
        return true
        }
        ++tmp
    }
    return false
}