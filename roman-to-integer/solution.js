function solution () {
    let map = {
        "I": 1,
        "V": 5,
        "X": 10,
        "L": 50,
        "C": 100,
        "D": 500,
        "M": 1000
    }
    const arr = s.split('')
    let result = 0
    for (let i = 0; i < arr.length; i++) {
        let current = map[arr[i]]
        let last = map[arr[i -1]]
        if (i > 0 && current > last) {
            result += current
            result = result - last*2
        }else{
            result += current
        }
    }
    return result
}