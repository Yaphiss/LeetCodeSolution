function solution (strs) {
    if (!strs || !strs.length) return ''
    const result = strs.reduce((prev, currv) => {
        for (let i = 0; i < prev.length; i++) {
            if (prev[i] !== currv[i]) return prev.slice(0, i)
        }
        return prev
    })
    return result ? result : ''
}

// test
const strs1 = ['xiezhixian', 'xiezhiqian', 'xiezheyi', 'xiezhehui']
console.log(solution(strs1))