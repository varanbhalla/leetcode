/**
 * @param {number[]} nums
 * @return {number}
 */

var singleNumber = function(nums) {
    let singleNumberValue = -1;
    const set = new Set();
    
    nums.forEach(element => {
        if (set.has(element)) {
            set.delete(element);
        } else {
            set.add(element);
        }
    })
    set.forEach(leftElement => {
        singleNumberValue = leftElement;
    })
    return singleNumberValue;
};





























