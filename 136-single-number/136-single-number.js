/**
 * @param {number[]} nums
 * @return {number}
 */

var singleNumber = function(nums) {
    let singleNumber = -1;
    const set = new Set();
    nums.forEach(element => {
        if (set.has(element)) {
            set.delete(element);
        } else {
            set.add(element);
        }
    })
    set.forEach(leftElement => {
        singleNumber = leftElement;
    })
    return singleNumber;
};





























