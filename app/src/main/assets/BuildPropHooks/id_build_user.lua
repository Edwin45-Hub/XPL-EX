function after(hook, param)
	local ret = param:getResult()
	if ret == nil then
		return false
	end

    local fake = param:getSetting("android.build.user", "god")
    param:setResult(fake)
    return true, ret, fake
end