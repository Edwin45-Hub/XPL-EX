function after(hook, param)
	local ret = param:getResult()
	if ret == nil then
		return false
	end

    local fake = param:getSetting("build.BOARD")
    if fake == nil then
        fake = "goldfish"
    end

    param:setResult(fake)
    return true, ret, fake
end