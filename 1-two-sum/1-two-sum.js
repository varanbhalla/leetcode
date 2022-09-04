/**
 * @param {number[]} nums
 * @param {number} target
 * @return {number[]}
 */
var twoSum = function(nums, target) {
    const hashMap = new Map();
    const resultIndices = []
    nums.forEach((num, index) => {
        const otherNum = target - num;
        if (hashMap.has(otherNum)) {
            const otherNumIndex = hashMap.get(otherNum);
            resultIndices.push(index);
            resultIndices.push(otherNumIndex);
            return resultIndices;
        } else {
            hashMap.set(num, index);
        }
    })
    return resultIndices;
};