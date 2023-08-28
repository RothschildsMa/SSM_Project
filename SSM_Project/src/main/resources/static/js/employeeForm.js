var currentDate = new Date();
	
// 计算最早可选日期（当前日期的年份 - 54年，月份和日期不变）
var earliestDate = new Date(currentDate.getFullYear() - 54, currentDate.getMonth(), currentDate.getDate() + 1);

// 计算最晚可选日期（当前日期 + 180天）
var latestDate = new Date(currentDate.getTime() + 180 * 24 * 60 * 60 * 1000);

// 获取日期输入框元素
var entryDateInput = document.getElementById('ENTRY_DATE');

// 设置最早和最晚可选日期
entryDateInput.min = earliestDate.toISOString().split('T')[0];
entryDateInput.max = latestDate.toISOString().split('T')[0];

console.log('Current Date:', currentDate);
console.log('Earliest Date:', earliestDate);
console.log('Latest Date:', latestDate);