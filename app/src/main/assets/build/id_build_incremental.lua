function after(hook, param)
	local ret = param:getResult()
	if ret == nil then
		return false
	end

    local fake = param:getSetting("android.build.incremental", "eng.ido.20231003.173955")
    param:setResult(fake)
    return true, ret, fake
end