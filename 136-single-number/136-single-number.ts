
function singleNumber(nums: number[]): number {
    const seen: Set<number> = new Set()
    
    for (let num of nums) {
        if (seen.has(num)) {
            seen.delete(num);
        } else {
            seen.add(num)
        }
    }
    
    for (let element of seen) {
        return element;
    }
};