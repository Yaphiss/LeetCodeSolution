function soltion (arr) {
    let newArr = []
    for (let item of arr) {
        newArr.push(Math.pow(item, 2))
    }
    return newArr.sort((a, b) => {return a-b})
}