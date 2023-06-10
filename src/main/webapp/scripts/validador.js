/**
 * Validação de Formularios
 * Author: Robson Ferreira
 */

function validar() {
	let nome = frmEquip.nome.value
	let quant = frmEquip.quant.value
	let tomb = frmEquip.tomb.value
	let valor = frmEquip.valor.value

	if (nome === "") {
		alert('Preencha o campo "Nome"!')
		frmEquip.nome.focus()
		return false
	} else if (quant === "") {
		alert('Preencha o campo "Quantidade"!')
		frmEquip.equip.focus()
		return false
	} else if (tomb === "") {
		alert('Preencha o campo "Tombamento"!')
		frmEquip.tomb.focus()
		return false
	}
	else if (valor === "") {
		alert('Preencha o campo "Valor"!')
		frmEquip.valor.focus()
	} else {
		document.forms['frmEquip'].submit()
	}
}