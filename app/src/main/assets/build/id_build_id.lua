function after(hook, param)
	local ret = param:getResult()
	if ret == nil then
		return false
	end

    local fake = param:getSetting("android.build.id", "TQ3A.230805.001")
    param:setResult(fake)
    return true, ret, fake
end